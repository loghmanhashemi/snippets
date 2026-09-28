#include <string>
#include <vector>
#include <complex>

int main(){
    int x{10};
    double d{3.14};
    std::string s{"hello"};
    std::vector<int> v{1, 2, 3, 4};
    class Point {
        public:
            int x;
            int y;
    };

    Point p{10, 20};
    int a[]{1, 2, 3};
    //An important advantage: narrowing conversions
    //int y{3.14};     // ERROR
    int y = 3.14;    // allowed, x becomes 3
    std::vector<int> aa(5, 10);//means five elements, each equal to 10
    std::vector<int> bb{5, 10};//means two elements: 5 and 10
    int z = 300;
    char c = z;
    //char c{300};    // ERROR

    std::complex<double> z1 = 1;// a complex number with double-precision floating-point scalars
    std::complex<double> z2 {1.2,2.3};
    std::complex<double> z3 = {1,2}; // the = is optional with { ... }
    


}