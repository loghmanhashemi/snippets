#include <iostream>
#include <future>
#include <thread>
#include <stdexcept>

void calculate(std::promise<int> p)
{
    try
    {
        std::cout << "Calculating..." << std::endl;

        int a = 10;
        int b = 20;

        // Simulate an error
        if (b == 20)
        {
            throw std::runtime_error("Calculation failed!");
        }

        int result = a + b;

        // Send result to main thread
        p.set_value(result);
    }
    catch (...)
    {
        // Store the exception in the promise
        p.set_exception(std::current_exception());
    }
}

int main()
{
    std::promise<int> promise;

    // Get the future associated with the promise
    std::future<int> future = promise.get_future();

    // Run calculation in another thread
    std::thread t(calculate, std::move(promise));

    try
    {
        // Wait for result or exception
        std::cout << "Result: " << future.get() << std::endl;
    }
    catch (const std::exception& e)
    {
        std::cout << "Exception caught in main: "
                  << e.what() << std::endl;
    }

    t.join();

    return 0;
}