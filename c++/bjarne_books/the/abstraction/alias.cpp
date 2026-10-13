template<typename T>
class Vector {
    public:
      using value_type = T;
    // ...
};


template<typename C>
using Element_type = typename C::value_type;

template<typename Container>
void algo(Container& c)
{
    Vector<Element_type<Container>> vec; // keep results here
    // ...
}


template<typename C>
void process(const C& container)
{
    using Element_type = typename C::value_type;

    Element_type element{};
    typename C::value_type another_element;
    
}



int main()
{
    Vector<int> v;
    process(v);
}