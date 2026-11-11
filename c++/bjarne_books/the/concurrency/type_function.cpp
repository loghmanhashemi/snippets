#include <iostream>
#include <type_traits>

template<typename T>
void process(T value) {

    if constexpr (std::is_integral_v<T>) {
        std::cout << "Integer type\n";
    }
    else {
        std::cout << "Non-integer type\n";
    }
}

int main() {
    process(10);
    process(3.14);
}