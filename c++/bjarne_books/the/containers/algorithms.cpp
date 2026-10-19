#include <iostream>
#include <algorithm>
#include <iterator>
#include <list>
#include <vector>

std::list<int> f(std::vector<int>& vec)
{
    std::list<int> res;
    std::sort(vec.begin(), vec.end());
    std::unique_copy(vec.begin(), vec.end(), std::back_inserter(res));
    return res;
}

int main()
{
    std::vector<int> vec{4, 2, 4, 1, 2, 3, 1};
    std::list<int> res = f(vec);
    std::cout << "Result: ";
    for (int x : res)
        std::cout << x << ' ';
    std::cout << '\n';
}
//Result: 1 2 3 4 