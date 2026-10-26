#include <iostream>
#include <mutex>
#include <thread>

std::mutex m;

void print(int id)
{
    std::unique_lock<std::mutex> lck{m};

    // Critical section: only one thread at a time
    std::cout << "Thread " << id << " is working\n";

} // lck is destroyed here, and m is unlocked

int main()
{
    std::thread t1(print, 1);
    std::thread t2(print, 2);

    t1.join();
    t2.join();
}