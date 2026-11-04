
#include <iostream>
#include <thread>
#include <queue>
#include <mutex>
#include <condition_variable>
#include <chrono>

using namespace std;

// Shared resources
queue<int> q;

mutex mtx;
condition_variable cv;

bool finished = false;

// Producer thread
void producer()
{
    for (int i = 1; i <= 10; i++)
    {
        {
            lock_guard<mutex> lock(mtx); //RAII lock

            q.push(i * 10);

            cout << "Produced: " << i * 10 << endl;
        }

        // Notify consumer that data is available
        cv.notify_one();

        this_thread::sleep_for(
            chrono::milliseconds(500)
        );
    }

    {
        lock_guard<mutex> lock(mtx);
        finished = true;
    }

    // Wake consumer so it can terminate
    cv.notify_one();
}

// Consumer thread
void consumer()
{
    while (true)
    {
        unique_lock<mutex> lock(mtx);

        // Wait until queue has data or producer finishes
        cv.wait(lock, [] {
            return !q.empty() || finished;
        });

        // No more data and producer finished
        if (q.empty() && finished)
            break;

        // Get data from queue
        int data = q.front();
        q.pop();

        lock.unlock();

        cout << "Consumed: " << data << endl;
    }
}

int main()
{
    thread t1(producer);
    thread t2(consumer);

    t1.join();
    t2.join();

    cout << "All tasks completed!" << endl;

    return 0;
}
