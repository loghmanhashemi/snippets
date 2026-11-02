#include <mutex>
using namespace std;
mutex m1,m2,m3;
void f()
{

    unique_lock<mutex> lck1 {m1,defer_lock};
    unique_lock<mutex> lck2 {m2,defer_lock};
    unique_lock<mutex> lck3 {m3,defer_lock};

    lock(lck1,lck2,lck3);

}
int main(){
    f();
}