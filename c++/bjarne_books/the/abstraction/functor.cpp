#include <list>
#include <string>
#include <iostream>
using namespace std;
template<typename T>
    class Vector {
    private:
        T* elem; // elem points to an array of sz elements of type T
        int sz;
    public:
        Vector(int s){
            elem = new T[s];
            sz = s;    
        }
        // constructor: establish invariant, acquire resources
        ~Vector() { delete [] elem; }
        // destructor: release resources
        // ... copy and move operations ...
        T& operator[](int i){
            return elem[i];
        }
        const T& operator[](int i) const{
            return elem[i];
        }
        int size() const { return sz; }
        const T* begin() const{
            return elem;
        }
        const T* end() const{
            return elem + sz;
        }
        
     

};

template<typename T>
class Less_than {
        const T val;
    // value to compare against
    public:
        Less_than(const T& v) :val(v) { }
        bool operator()(const T& x) const { return x<val; } // call operator
};

template<typename C, typename P>
int count(const C& c, P pred)
{
    int cnt = 0;
    for (const auto& x : c)
        if (pred(x))
            ++cnt;
    return cnt;
}
void f(const Vector<int>& vec,int x)
{
    std::cout << "number of values less than " << x
    << ": " << count(vec,Less_than<int>{x})
    << '\n';
   
}
int main(){
    Vector<int> vi(5);

    vi[0] = 1;
    vi[1] = 2;
    vi[2] = 3;
    vi[3] = 4;
    vi[4] = 5;
    f(vi,3);
}