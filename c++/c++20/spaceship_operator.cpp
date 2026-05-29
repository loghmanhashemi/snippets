#include <bits/stdc++.h>
#include <compare>
using namespace std;


int main()
{
    int a = 91, b = 110;
    auto ans1 = a <=> b;

    if (ans1 < 0) {
        cout << "a < b\n";
    }
    else if (ans1 == 0) {
        cout << "a == b\n";
    }
    else if (ans1 > 0) {
        cout << "a > b\n";
    }

    vector<int> v1{ 3, 6, 9 };
    vector<int> v2{ 3, 6, 9 };
    auto ans2 = v1 <=> v2;

    if (ans2 < 0) {
        cout << "v1 < v2\n";
    }
    else if (ans2 == 0) {

        cout << "v1 == v2\n";
    }
    else if (ans2 > 0) {

        cout << "v1 > v2\n";
    }

    cout << endl;
}