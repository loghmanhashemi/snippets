#include <iostream>
#include <utility>
#include <string>
#include <tuple>



std::pair<int, int> calculate(int a, int b)
{
    return std::make_pair(a + b, a * b);
}

std::tuple<int, int, double> calculate2(int a, int b)
{
    return std::make_tuple(a + b, a * b, (double)a / b);
}

int main()
{
    std::pair<int, std::string> p;

    p.first = 10;
    p.second = "Hello";

    std::cout << p.first << '\n';   // 10
    std::cout << p.second << '\n';  // Hello

    auto p2 = std::make_pair(10, std::string("Hello"));

    std::cout << p2.first << '\n';
    std::cout << p2.second << '\n';
    
    std::tuple<int, std::string, double> t;

    t = std::make_tuple(10, "Loghman", 85.5);

    std::cout << std::get<0>(t) << '\n'; // 10
    std::cout << std::get<1>(t) << '\n'; // Loghman
    std::cout << std::get<2>(t) << '\n'; // 85.5

    auto t2 = std::make_tuple(10, std::string("Loghman"), 85.5);

    int id;
    std::string name;
    double score;
    //std::tie() creates a tuple of references to existing variables.
    std::tie(id, name, score) = t2; 

    std::cout << id << '\n';
    std::cout << name << '\n';
    std::cout << score << '\n';

    //C++17 introduced a more convenient way to unpack pairs and tuples.
    auto p3 = std::make_pair(10, std::string("Hello"));

    auto [number, text] = p3;

    std::cout << number << '\n';
    std::cout << text << '\n';



    auto t3 = std::make_tuple(10, std::string("Loghman"), 85.5);

    auto [id2, name2, score2] = t3;

    std::cout << id2 << '\n';
    std::cout << name2 << '\n';
    std::cout << score2 << '\n';

    auto [sum, product] = calculate(10, 5);

    std::cout << "Sum: " << sum << '\n';
    std::cout << "Product: " << product << '\n';

    auto [sum2, product2, division2] = calculate2(10, 5);

    std::cout << sum2 << '\n';
    std::cout << product2 << '\n';
    std::cout << division2 << '\n';

}
/*
10
Hello
10
Hello
10
Loghman
85.5
10
Loghman
85.5
10
Hello
10
Loghman
85.5
Sum: 15
Product: 50
15
50
2

*/


