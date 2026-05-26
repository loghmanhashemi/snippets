#include <iostream>
#include <coroutine>

// A simple generator class
struct Generator {
    struct promise_type {
        int current_value = 0;
        std::suspend_always yield_value(int value) {
            current_value = value;
            return {};
        }
        Generator get_return_object() {
            return Generator{std::coroutine_handle<promise_type>::from_promise(*this)};
        }
        std::suspend_always initial_suspend() { return {};}
        std::suspend_always final_suspend() noexcept { return {}; }
        void return_void() {}
        void unhandled_exception() { std::terminate(); }
    };

    std::coroutine_handle<promise_type> handle;

    Generator(std::coroutine_handle<promise_type> h) : handle(h) { }
    ~Generator() { if (handle) handle.destroy(); }

    bool move_next() {
        if (!handle.done()) {
            handle.resume();
        }
        return !handle.done();
    }

    int current() {
        return handle.promise().current_value;
    }
};

// Coroutine function that generates numbers from 0 to 4
Generator count() {
    for (int i = 0; i < 5; ++i) {
        co_yield i;
    }
}

int main() {
    auto gen = count();
    while (gen.move_next()) {
         std::cout << gen.current() << std::endl;
    }

    return 0;
}
