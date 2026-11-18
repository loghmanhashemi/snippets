/*
TAG DISPATCH:

This example from Stroustrup demonstrates tag dispatch, a C++ technique that selects 
an algorithm at compile time based on the iterator category.

Not all iterators support the same operations.

For example:

Iterator category	                Capabilities
Input iterator	                    Read elements, move forward
Forward iterator	                Read/write, move forward, revisit elements
Bidirectional iterator             	Move forward and backward
Random-access iterator	            Jump to any position, use [], subtraction, etc.

The important distinction here is that std::sort() requires random-access iterators.

std::vector<int> v{5, 2, 8, 1};
std::sort(v.begin(), v.end()); // OK

std::list<int> l{5, 2, 8, 1};
std::sort(l.begin(), l.end()); // Compilation error

A std::list has bidirectional iterators, not random-access iterators.


*/


#include <iostream>
#include <vector>
#include <forward_list>
#include <algorithm>
#include <iterator>
#include <type_traits>

// 1. Get the iterator type of a container
template<typename C>
using Iterator_type = typename C::iterator;

// 2. Get the iterator category
template<typename Iter>
using Iterator_category =
    typename std::iterator_traits<Iter>::iterator_category;


// 3. Implementation for random-access iterators
template<typename Ran>
void sort_helper(Ran beg, Ran end)
{
    std::cout << "Using random-access sorting\n";

    std::sort(beg, end);
}


// 4. Implementation for forward iterators
template<typename For>
void sort_helper(For beg,For end,std::forward_iterator_tag)
{
    std::cout << "Using forward-iterator sorting\n";

    using T = typename std::iterator_traits<For>::value_type;

    // Copy elements into a vector
    std::vector<T> v(beg, end);
    //vector<decltype(∗beg)> v {beg,end}; ???
    
    // Sort the vector
    std::sort(v.begin(), v.end());

    // Copy sorted elements back
    std::copy(v.begin(), v.end(), beg);
}


// 5. Generic sorting function
template<typename C>
void my_sort(C& c)
{
    using Iter = Iterator_type<C>;

    sort_helper(c.begin(),c.end(),Iterator_category<Iter>{});
}


// 6. Print container elements
template<typename C>
void print(const C& c)
{
    for (const auto& x : c)
        std::cout << x << " ";

    std::cout << '\n';
}


// 7. Main
int main()
{
    // Random-access iterator example
    std::vector<int> v{50, 10, 40, 20, 30};

    std::cout << "Vector before sorting: ";
    print(v);

    my_sort(v);

    std::cout << "Vector after sorting:  ";
    print(v);


    std::cout << "\n";


    // Forward iterator example
    std::forward_list<int> fl{50, 10, 40, 20, 30};

    std::cout << "Forward list before sorting: ";
    print(fl);

    my_sort(fl);

    std::cout << "Forward list after sorting:  ";
    print(fl);

    return 0;
}
/*
output:

Vector before sorting: 50 10 40 20 30 
Using forward-iterator sorting
Vector after sorting:  10 20 30 40 50 

Forward list before sorting: 50 10 40 20 30 
Using forward-iterator sorting
Forward list after sorting:  10 20 30 40 50 

*/