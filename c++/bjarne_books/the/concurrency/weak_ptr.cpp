#include <iostream>
#include <memory>

int main()
{
    auto p = std::make_shared<int>(42);

    std::weak_ptr<int> w = p;

    std::cout << p.use_count() << '\n'; // 1

    p.reset(); // Release the shared ownership

    if (w.expired())
        std::cout << "Object no longer exists\n";
}