#include <chrono>
#include <thread>
#include <iostream>
using namespace std;
using namespace std::chrono;
int main(){
    this_thread::yield();
    auto t0 = high_resolution_clock::now();
    this_thread::sleep_for(milliseconds{20});
    auto t1 = high_resolution_clock::now();
    cout << duration_cast<nanoseconds>(t1-t0).count() << " nanoseconds passed\n";
}
//20170522 nanoseconds passed
