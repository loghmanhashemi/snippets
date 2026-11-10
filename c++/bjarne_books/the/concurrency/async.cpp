#include <vector>
#include <numeric>
#include <future>
#include <iostream>
/*
Basically, async() separates the ‘‘call part’’ of a function call from the ‘‘get the result part,’’
Using async(), you don’t have to think about threads and locks
*/
using namespace std;
double accum(double* beg, double * end, double init)
// compute the sum of [beg:end) starting with the initial value init
{
    return accumulate(beg,end,init);//standard c++ function
}
double comp4(vector<double>& v)
// spawn many tasks if v is large enough
{
    if (v.size()<10000) 
        return accum(v.data(),v.data()+v.size(),0.0);
    auto v0 = &v[0];
    auto sz = v.size();
    auto f0 = async(accum,v0,v0+sz/4,0.0);  // first quarter
    auto f1 = async(accum,v0+sz/4,v0+sz/2,0.0);    // second quarter
    auto f2 = async(accum,v0+sz/2,v0+sz*3/4,0.0);// third quarter
    auto f3 = async(accum,v0+sz*3/4,v0+sz,0.0);// fourth quarter
    return f0.get()+f1.get()+f2.get()+f3.get(); // collect and combine the results
}
int main(){
    vector<double> v{1.,2.,3.,4.};
    cout << comp4(v);
}