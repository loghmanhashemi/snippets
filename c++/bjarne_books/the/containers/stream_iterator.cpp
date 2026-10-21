#include <iostream>
#include <iterator> 
using namespace std;
ostream_iterator<string> oo{cout};
int main(){
    *oo = "Hello, ";
    //   oo++; //does nothing 
    *oo = "world!\n";
}
