#include <type_traits>
#include <string>

template<typename Scalar>
class complex {
    static_assert(
        std::is_arithmetic_v<Scalar>,
        "Sorry, I only support complex of arithmetic types"
    );

    Scalar re, im;

public:
    complex(Scalar r, Scalar i) : re(r), im(i) {}
};

int main()
{
    complex<double> c1(1.0, 2.0);
    complex<int> c2(1, 2);

    //complex<std::string> c3("a", "b"); // Compilation error
}