/*

In C++, container adaptors are classes that provide a specific interface on top of an existing container. They restrict or adapt the operations available, rather than exposing the full interface of the underlying container.
The three standard container adaptors are:

Adaptor	                Behavior	                       Main operations
std::stack          	Last In, First Out (LIFO)       	push(), pop(), top()
std::queue	            First In, First Out (FIFO)	        push(), pop(), front(), back()
std::priority_queue	    Highest-priority element first	    push(), pop(), top()


*/

#include <stack>
#include <queue>
#include <iostream>

int main() {
    std::stack<int> s;

    s.push(10);
    s.push(20);
    s.push(30);

    std::cout << s.top() << '\n'; // 30

    s.pop();                      // Removes 30

    std::cout << s.top() << '\n'; // 20

    std::queue<int> q;

    q.push(10);
    q.push(20);
    q.push(30);

    std::cout << q.front() << '\n'; // 10

    q.pop();                        // Removes 10

    std::cout << q.front() << '\n'; // 20

     std::priority_queue<int> pq;

    pq.push(10);
    pq.push(30);
    pq.push(20);

    std::cout << pq.top() << '\n'; // 30

    pq.pop();                      // Removes 30
    std::cout << pq.top() << '\n'; // 20
//IMPORTANT: 
//You can also specify a different compatible container:
    std::stack<int, std::vector<int>> anotherStack;


}

