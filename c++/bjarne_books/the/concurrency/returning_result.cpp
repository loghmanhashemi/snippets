#include <thread>
#include <iostream>
#include <vector>

using namespace std;
void f(const vector<double>& v, double* res){
    { cout << "Hello "; }
}// function

class F {
    public:
        F(const vector<double>& vv,double* res) :v{vv},res{res}{}
        void operator()() { cout << "Parallel World!\n"; }
    private:
        double* res;
        const vector<double>& v;
};// function object


int main(){
    vector<double> some_vec {1,2,3,4,5,6,7,8,9};
    vector<double> vec2 {10,11,12,13,14};
    double res1;
    double res2;
    thread t1 {f,std::ref(some_vec),&res1};
    thread t2 {F{vec2,&res2}};
    t1.join();
    t2.join();
}