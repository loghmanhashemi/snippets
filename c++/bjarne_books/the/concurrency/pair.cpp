#include <iostream>
#include <vector>
#include <algorithm>

int main()
{
    std::vector<int> v = {1, 2, 3, 3, 3, 4, 5, 6};

    auto result = std::equal_range(v.begin(), v.end(), 3);

    std::cout << "First position: "
              << result.first - v.begin() << '\n';

    std::cout << "Last position: "
              << result.second - v.begin() << '\n';

    for (auto it = result.first; it != result.second; ++it)
        std::cout << *it << ' ';
}