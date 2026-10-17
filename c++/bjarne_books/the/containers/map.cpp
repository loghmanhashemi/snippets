/*
map vs unordered map
Main differences

Feature	            std::map	                                    std::unordered_map
Header	            <map>	                                        <unordered_map>
Data structure	    Typically a balanced binary search tree	        Hash table
Element order	    Sorted by key	                                No guaranteed order
Search	             O(log n)	                                    Average O(1), worst O(n)
Insert/erase	    O(log n)                                    	Average O(1), worst O(n)
Memory usage	    Often lower overhead per element	            Often higher due to buckets
Custom ordering	    Yes, via comparator	                            No sorting; requires a hash function and equality comparison
Duplicate keys	    Not allowed	                                    Not allowed



>Binary Search Tree (BST): Left child has smaller keys; right child has larger keys.
>Balanced BST: Keeps its height relatively small to ensure efficient operations.
>Red-Black Tree: A self-balancing BST that uses red and black node colors to maintain balance.
>std::map: An ordered associative container commonly implemented using a Red-Black Tree.

*/
#include <map>
#include <string>
#include <iostream>
#include <unordered_map>
using namespace std;
std::map<int, std::string> m{
    {3, "three"}, {1, "one"}, {2, "two"}
};
std::unordered_map<std::string, int> um{
        {"apple", 10},
        {"banana", 20},
        {"peach", 30}
};
int main(){
    for (const auto& [key, value] : m)
        cout << key << ' ';
    for (const auto& [key, value] : um)
        std::cout << key << ": " << value << '\n';    
}
/*
1 2 3 peach: 30
banana: 20
apple: 10

*/