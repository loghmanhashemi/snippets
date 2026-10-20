#include <string>
#include <vector>
#include <iostream>
#include <algorithm>
#include <iterator>
#include <list>
using namespace std;
bool has_c(const string& s, char c){
    return find(s.begin(),s.end(),c)!=s.end();
}

vector<string::iterator> find_all(string& s, char c)
{
    vector<string::iterator> res;
    for (auto p = s.begin(); p!=s.end(); ++p)
    if (*p==c)
    res.push_back(p);
    return res;
}
void test_find_all()
{
    string m {"Mary had a little lamb"};
    for (auto p : find_all(m,'a'))
        if (*p!='a')
            cerr << "a bug!\n";
}
template<typename C, typename V>
vector<typename C::iterator> another_find_all(C& c, V v)
{
    vector<typename C::iterator> res;
    for (auto p = c.begin(); p!=c.end(); ++p)
         if (*p==v)
             res.push_back(p);
    return res;
}

template<typename T>
using Iterator = typename T::iterator;

template<typename C, typename V>
vector<Iterator<C>> yet_another_find_all(C& c, V v)
{
    vector<Iterator<C>> res;
    for (auto p = c.begin(); p!=c.end(); ++p)
    if (*p==v)
        res.push_back(p);
    return res;
}
void test_another_find_all()
{
    string m {"Mary had a little lamb"};
    for (auto p : another_find_all(m,'a'))
        if (*p!='a')
             cerr << "string bug!\n";
    // p is a string::iterator
    list<double> ld {1.1, 2.2, 3.3, 1.1};
    for (auto p : another_find_all(ld,1.1))
        if (*p!=1.1)
             cerr << "list bug!\n";
    vector<string> vs { "red", "blue", "green", "green", "orange", "green" };
    for (auto p : another_find_all(vs,"green"))
            if (*p!="green")
                cerr << "vector bug!\n";
    for (auto p : another_find_all(vs,"green"))
        *p = "vert";
}
void test_yet_another_find_all()
{
    string m {"Mary had a little lamb"};
    for (auto p : yet_another_find_all(m,'a'))
        if (*p!='a')
             cerr << "string bug!\n";
    // p is a string::iterator
    list<double> ld {1.1, 2.2, 3.3, 1.1};
    for (auto p : yet_another_find_all(ld,1.1))
        if (*p!=1.1)
             cerr << "list bug!\n";
    vector<string> vs { "red", "blue", "green", "green", "orange", "green" };
    for (auto p : yet_another_find_all(vs,"green"))
            if (*p!="green")
                cerr << "vector bug!\n";
    for (auto p : yet_another_find_all(vs,"green"))
        *p = "vert";
}
int main(){
    test_find_all();
    test_another_find_all();
    test_yet_another_find_all();
}