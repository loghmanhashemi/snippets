#include <iostream>
#include <future>
#include <thread>

int add(int a, int b) {
    return a + b;
}
/*
other syntax: lambda
std::packaged_task<int(int, int)> task(
    [](int a, int b) {
        return a + b;
    }
);
three types of callable: function,functor,lambda
*/
int main() {
    std::packaged_task<int(int, int)> task(add);

    // Get the future
    std::future<int> future = task.get_future();

    // Execute task in another thread
    std::thread t(std::move(task), 10, 20);

    // Get result
    std::cout << "Result: " << future.get() << std::endl;

    t.join();

    return 0;
}