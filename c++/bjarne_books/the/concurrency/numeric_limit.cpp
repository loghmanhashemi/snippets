#include <iostream>
#include <limits>

int main() {
    std::cout << std::numeric_limits<int>::min() << '\n';
    std::cout << std::numeric_limits<int>::max() << '\n';
    std::cout << std::numeric_limits<float>::min() << '\n';
    std::cout << std::numeric_limits<float>::max() << '\n';
    constexpr float min = std::numeric_limits<float>::min();
    constexpr int szi = sizeof(int);
}
/*
-2147483648
2147483647
1.17549e-38
3.40282e+38

*/