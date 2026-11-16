#include <iostream>
#include <forward_list>
#include <iterator>
#include <type_traits>
#include <sstream>

template <typename Iterator>
void process(Iterator first, Iterator last)
{
    using Category =
        typename std::iterator_traits<Iterator>::iterator_category;

    static_assert(
        std::is_base_of_v<std::forward_iterator_tag, Category>,
        "Forward iterator or better required"
    );

    while (first != last)
    {
        std::cout << *first << " ";
        ++first;
    }
}

int main()
{
    std::forward_list<int> numbers = {1, 2, 3, 4};
    process(numbers.begin(), numbers.end());

    std::istringstream stream("10 20 30");
    std::istream_iterator<int> first(stream);
    std::istream_iterator<int> last;
    process(first, last); // Compilation error!
    //error: static assertion failed: Forward iterator or better required

}