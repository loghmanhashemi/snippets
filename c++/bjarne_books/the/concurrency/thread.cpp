#include <thread>
#include <iostream>
using namespace std;
void f(){
    { cout << "Hello "; }
}// function
struct F {
     void operator()() { cout << "Parallel World!\n"; }
};// function object


//PaHerallllel o World!
int main(){
    thread t1 {f};
    thread t2 {F()};
    t1.join();
    t2.join();
}