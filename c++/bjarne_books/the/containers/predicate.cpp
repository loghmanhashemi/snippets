#include <iostream>
#include <vector>
#include <algorithm>

struct Greater_than {
    int value;

    bool operator()(int x) const {
        return x > value;
    }
};

int main() {
    std::vector<int> m = {10, 25, 42, 50, 60};

    auto it = std::find_if(m.begin(), m.end(), Greater_than{42});

    if (it != m.end()) {
        std::cout << "Found: " << *it << '\n';  // Found: 50
    }
}