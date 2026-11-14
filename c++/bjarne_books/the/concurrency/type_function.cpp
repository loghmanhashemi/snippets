#include <iostream>
#include <type_traits>
/*
There are two separate decisions:
1. if (get(&f, &i)) is evaluated at runtime.
2. if constexpr inside process() is evaluated at compile time.
*/
template<typename T>
void process(T value) {

    if constexpr (std::is_integral_v<T>) {
        std::cout << "Integer type\n";
    }
    else {
        std::cout << "Non-integer type\n";
    }
}
bool get(float* f,int* i){
    //unspecified:  return value will be determined in runtime( sometimes true sometimes false )
}
int main() {
    //process(10);
    //process(3.14);
    float f;
    int i;
    if(get(&f,&i))
        process(i);//template instantiation at comile time
    else    
        process(f);//template instantiation at comile time
    
}