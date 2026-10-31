/*
a variadic template can accept an arbitrary number of arguments
the std::thread constructor looks something like this:
template<class Function, class... Args>
explicit thread(Function&& f, Args&&... args);
A variadic template constructor uses Args... to accept any number of 
arguments, allowing std::thread to launch functions with different parameter lists.
Important C++ threading concept
Remember this rule:
- std::thread copies its arguments by default.
- String literals are passed as const char*.
- If you need to pass a non-const reference, use std::ref().
- Every joinable thread must be joined or detached before destruction.


*/
#include <thread>
#include <iostream>
#include <vector>
void function1(){}
void function2(int a){}
void function3(int a,int b , int c){}
void function4(const char *,float a,std::vector<int>){}
std::vector<int> some_vec{1, 2, 3, 4, 5};


  
int main(){
    std::thread t1{function1};
    std::thread t2{function2, 10};
    std::thread t3{function3, 10, 20, 30};
    std::thread t4{function4, "hello", 3.14, some_vec};
    t1.join();
    t2.join();
    t3.join();
    t4.join();

    return 0;
}