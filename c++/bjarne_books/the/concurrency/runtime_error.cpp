#include <iostream>
#include <stdexcept>

int main() {
    try {
        throw std::runtime_error("File not found");
    }
    catch (const std::runtime_error& e) {
        std::cerr << "Runtime error: " << e.what() << '\n';
    }
}