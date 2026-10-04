/*
static_assert is a compile-time check in C++.
static_assert(condition, "error message");
"This condition must be true when compiling the program. 
If it isn't, stop compilation and show an error."

*/
constexpr double C = 299792.458;// km/s
void f(double speed)
{
    constexpr double local_max = 160.0/(60 * 60);// 160 km/h == 160.0/(60*60) km/s
    //static_assert(speed<C,"can't go that fast"); // error : speed must be a constant
    static_assert(local_max < C,"can't go that fast"); // OK
}
int main(){

}