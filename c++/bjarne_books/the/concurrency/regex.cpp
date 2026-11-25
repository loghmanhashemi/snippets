#include <iostream>
#include <regex>
#include <string>

/*
Expression	          Meaning
    \w	                A word character (letters, digits, underscore)
    {2}	                Exactly 2 occurrences
    \s	                A whitespace character (space, tab, etc.)
    *	                Zero or more occurrences
    \d	                A digit (0–9)
    {5}             	Exactly 5 digits
    (...)               A capturing group
    -	                A literal hyphen
    {4}             	Exactly 4 occurrences
    ?	                Zero or one occurrence
------------------------------------------
What is R"(...)" in C++?
This is a C++ feature called a raw string literal, introduced in C++11.
*/
using namespace std;
int main()
{
    string pattern =R"(\w{2}\s*\d{5}(-\d{4})?)";
 
    std::regex pat(pattern);

    std::cout << "pattern: " << pattern << '\n';

     std::string tests[] = {
        "TX 77845",
        "TX77845",
        "TX 77845-1234",
        "TX 7784",
        "T 77845",
        "TX 77845-123"
    };

    for (const auto& s : tests)
    {
        std::cout << s << " : "
                  << std::regex_match(s, pat)
                  << '\n';
    }

}

/*
pattern: \w{2}\s*\d{5}(-\d{4})?
TX 77845 : 1
TX77845 : 1
TX 77845-1234 : 1
TX 7784 : 0
T 77845 : 0
TX 77845-123 : 0

*/