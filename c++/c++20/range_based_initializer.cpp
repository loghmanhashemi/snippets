// Range-based for loop with Initialization:
#include <iostream>
#include <vector>
using namespace std;


int main()
{

   for (std::vector v{ 1, 2, 3 }; auto& e : v) {
        std::cout << e;
    }
}