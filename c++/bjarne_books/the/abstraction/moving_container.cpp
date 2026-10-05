#include <stdexcept>
class Vector {
    private:
        double* elem; // elem points to an array of sz doubles
        int sz;
    public:
        Vector(int s){} // constructor
        Vector(Vector&& a)//move constructor
            :elem{a.elem},sz{a.sz}
            {
                a.elem = nullptr; // now a has no elements
                a.sz = 0;
            }
        ~Vector() { delete[] elem; } // destructor
        Vector(const Vector& a); // copy constructor
        Vector& operator=(const Vector& a);// copy assignment
        Vector& operator=(Vector&& a); // move assignment
               
        double& operator[](int i) {
            return elem[i];
        }
        const double& operator[](int i) const{
            return elem[i];
        }
        int size() const{ 
            return sz;
        };
};
Vector& Vector::Vector::operator=(Vector&& a)
{
    if (this != &a) {
        delete[] elem;       // release our current resource

        elem = a.elem;       // steal a's resource
        sz = a.sz;

        a.elem = nullptr;    // leave a in valid state
        a.sz = 0;
    }

    return *this;
}

Vector operator+(const Vector& a, const Vector& b)
{
    if (a.size()!=b.size())
        throw std::invalid_argument("Vector sizes do not match");
    Vector res(a.size());
    for (int i=0; i!=a.size(); ++i)
       res[i]=a[i]+b[i];
    return res;
}
void f(const Vector& x, const Vector& y, const Vector& z)
    {
    Vector r(10);
    
    r = x+y+z;
  
}
int main(){

}