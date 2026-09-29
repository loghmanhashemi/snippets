#include <vector>
constexpr double square(double x) { 
    return x * x; 
}
double sum(const std::vector<double>& v)
{
    double result = 0;
    for (double x : v)
        result += x;
    return result;
}
int main(){
    const int dmv = 17; // dmv is a named constant
    int var = 17;       // var is not a constant
    constexpr double max1 = 1.4 * square(dmv);      // OK if square(17) is a constant expression
    //constexpr double max2 = 1.4 * square(var);    // error : var is not a constant expression
    const double max3 = 1.4 * square(var);          // OK, may be evaluated at run time
    
    std::vector<double> v {1.2, 3.4, 4.5};          // v is not a constant
    const double s1 = sum(v);                       // OK: evaluated at run time
   // constexpr double s2 = sum(v);                   // error : sum(v) not constant expression
}