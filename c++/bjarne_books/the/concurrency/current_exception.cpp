#include <iostream>
#include <exception>
#include <stdexcept>

int main() {
    try {
        throw std::runtime_error("Something went wrong");
    }
    catch (...) {
        std::exception_ptr eptr = std::current_exception();

        try {
            std::rethrow_exception(eptr);
        }
        catch (const std::exception& e) {
            std::cout << e.what() << '\n';
        }
    }
}