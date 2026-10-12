#include <iostream>
using namespace std;

template <typename... Args>
void print_using_fold(Args... args)
{
    //is a fold expression, introduced in C++17, that applies the << operator to all arguments.
    (cout << ... << args); 
}
int use_fold_expression()
{
    print_using_fold(10, 20, 30);
    cout << endl;

    print_using_fold("Hello ", "World!");
    cout << endl;

    print_using_fold(10, " apples ", 3.5);

    return 0;
}

// Base case
void print_using_recursion()
{
    cout << endl;
}

// Recursive template
template <typename T, typename... Args>
void print_using_recursion(T first, Args... rest)
{
    cout << first << " ";
    print_using_recursion(rest...);
}

int use_recursion()
{
    print_using_recursion(10, 20, 30);
    print_using_recursion("Hello", 100, 3.14);

    return 0;
}
int main(){
    use_recursion();
    use_fold_expression();
}
/*
10 20 30 
Hello 100 3.14 
102030
Hello World!
10 apples 3.5
*/