#include <vector>
#include <iostream>
using namespace std;
template<typename T>
class Vec : public std::vector<T> {
    public:
        using vector<T>::vector; // use the constructors from vector (under the name Vec); see §20.3.5.1
        T& operator[](int i)
        { return vector<T>::at(i); }  // range check
        const T& operator[](int i) const
        { return vector<T>::at(i); } // range check const objects;
  
};

int main(){
    Vec<int> v{10, 20, 30};
    v[0] = 100;  // the first overload is selected.
    cout << v[0];  //the second overload is selected. 
}