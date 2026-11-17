#include <iostream>
#include <vector>

int main() {
    std::vector<int> original = {10, 20, 30, 40, 50};

    auto first = original.begin() + 1;
    auto last  = original.begin() + 4;

    std::vector<int> v{first, last}; // same as std::vector<int> v(first, last);

    for (int x : v)
        std::cout << x << " ";
}