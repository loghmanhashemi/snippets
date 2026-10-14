#include <iostream>
#include <string>

int main()
{
    std::string s;
    /*send EOF
        Linux: Ctrl+D
        Windows (Command Prompt): Ctrl+Z, then Enter
    */
    while (std::cin >> s) { // EOF or Failure: false
        std::cout << "Read: " << s << '\n';
    }

    std::cout << "EOF or input failure detected\n";
}
/*
11
Read: 11
ee
Read: ee
EOF or input failure detected

*/