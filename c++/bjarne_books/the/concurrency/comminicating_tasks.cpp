#include <iostream>
#include <future>
#include <thread>

void calculate(std::promise<int> p)
{
    int result = 10 + 20;
    p.set_value(result);
}

int main()
{
    std::promise<int> promise;

    // Get the future associated with the promise
    std::future<int> future = promise.get_future();

    // Run calculation in another thread
    std::thread t(calculate, std::move(promise));

    // Wait for the result
    std::cout << "Result: " << future.get() << std::endl;

    t.join();

    return 0;
}