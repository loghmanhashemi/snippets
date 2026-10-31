#include <thread>
#include <iostream>
#include <vector>

using namespace std;
void f(vector<double>& v){
    { cout << "Hello "; }
}// function
struct F {
    vector<double>& v;
    F(vector<double>& vv) :v{vv} { }
    void operator()() { cout << "Parallel World!\n"; }
};// function object


int main(){
    vector<double> some_vec {1,2,3,4,5,6,7,8,9};
    vector<double> vec2 {10,11,12,13,14};
    thread t1 {f,std::ref(some_vec)};
    thread t2 {F{vec2}};
    t1.join();
    t2.join();
}