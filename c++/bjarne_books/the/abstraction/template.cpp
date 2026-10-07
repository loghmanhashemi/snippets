#include <list>
#include <vector>
#include <complex>
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

template<typename Container, typename Value>
Value sum(const Container& c, Value v)
{
    for (auto x : c)
        v+=x;
    return v;
}

void user(Vector<int>& vi, std::list<double>& ld, std::vector<complex<double>>& vc)
{
    int x = sum(vi,0);
    // the sum of a vector of ints (add ints)
    double d = sum(vi,0.0);
    // // the sum of a vector of ints (add doubles)
    double dd = sum(ld,0.0);
    // // the sum of a list of doubles
    auto z = sum(vc,complex<double>{}); // the sum of a vector of complex<double>
    // the initial value is {0.0,0.0}
}


int main()
{
    Vector<int> vi(5);

    vi[0] = 1;
    vi[1] = 2;
    vi[2] = 3;
    vi[3] = 4;
    vi[4] = 5;

    std::list<double> ld{1.5, 2.5, 3.5};

    std::vector<std::complex<double>> vc{
        {1.0, 2.0},
        {3.0, 4.0},
        {5.0, 6.0}
    };

    user(vi, ld, vc);
}