#include <iostream>

namespace old_parent_ns {

    inline namespace old_nested_ns1 {

        namespace old_nested_ns2 {
            void func() {
                std::cout << "Function from Old Definition\n";
            }
        }

    }
}

namespace new_parent_ns {

    inline namespace new_nested_ns1 {

        namespace new_nested_ns2 {
            void func() {
                std::cout << "Function from New Definition\n";
            }
        }

    }
}

int main()
{
   old_parent_ns::old_nested_ns2::func();
   old_parent_ns::old_nested_ns1::old_nested_ns2::func();

   new_parent_ns::new_nested_ns2::func();
   new_parent_ns::new_nested_ns1::new_nested_ns2::func();
}