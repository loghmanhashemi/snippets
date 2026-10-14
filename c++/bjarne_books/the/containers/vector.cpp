#include <vector>
#include <string>
struct Shape {
 
};
using namespace std;
int main(){
    vector<int> v1 = {1, 2, 3, 4};
    vector<string> v2;
    vector<Shape∗> v3(23);
    vector<double> v4(32,9.9);
// size is 4
// size is 0
// size is 23; initial element value: nullptr
// size is 32; initial element value: 9.9

}