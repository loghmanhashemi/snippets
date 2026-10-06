/*
NRVO = Named Return Value Optimization.
It is a C++ optimization where the compiler constructs a local named object directly in the caller's 
return-object storage, instead of creating the local object and then copying/moving it.
in fact c++ compiler automatcally optimized large return values.

Point:  NRVO is not move semantics.

NRVO:
    no copy
    no move
    one object

No NRVO:
    move may happen
    local object is destroyed


Vector create()
{
    Vector v;
    return v;
}
The compiler can choose NRVO.
But:
Vector create(bool condition)
{
    Vector a;
    Vector b;

    if (condition)
        return a;
    else
        return b;
}
NRVO is generally not possible for both paths because there are two different named objects
that could be returned. In such a case, a move can be used instead.
One particularly important point: 
    NRVO is permitted but not guaranteed.
NRVO  vs move semantics:

|                            | NRVO                  | Move semantics                        |
| -------------------------- | --------------------- | ------------------------------------- |
| What is it?                | Compiler optimization | C++ language mechanism                |
| Objects created            | **One**               | **Two**                               |
| Copy?                      | No                    | No                                    |
| Move?                      | No                    | Yes                                   |
| Move constructor called?   | No                    | Yes                                   |
| Resource transferred?      | No transfer needed    | Yes                                   |
| Requires move constructor? | No                    | Yes, if moving resource-owning object |


*/
class Vector {
    private:
        double* elem; // elem points to an array of sz doubles
        int sz;
    public:
        Vector(int s){} // constructor
        Vector(const Vector& a); // copy constructor
        Vector(Vector&& a)//move constructor
            :elem{a.elem},sz{a.sz}
            {
                a.elem = nullptr; // now a has no elements
                a.sz = 0;
            }
        ~Vector() { delete[] elem; } // destructor  
};
Vector init(int n){
    Vector vec(n);
    return vec;
}
int main(){
    Vector res =  init(1'000'000);     //if nrvo dont work move scemanic comes to play

}