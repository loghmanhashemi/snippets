/*
If you haven't written a copy constructor, C++ may implicitly generate one for you
Explicitly = delete
*/
class X {
public:
    X(){};
};
class Y {
public:
    Y(){};

    Y(const Y&) = delete;
};
int main(){
    X a;
    X b = a;   // ✅ potentially allowed
    Y c;
    //Y d = c;  // ❌ compilation error
    
}