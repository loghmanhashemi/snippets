#include <vector>
#include <memory>
#include <iostream>

struct Shape {
    std::string name;
    void draw(){
        std::cout << "drawing " << name << std::endl;
    }
    void rotate(){
        std::cout << "rotating " << name << std::endl;
    }
};

Shape  read_shape(std::istream& is)
{
    Shape s;
    is >> s.name;
    return s;
}

template<class C, class Oper>
void for_all(C& c, Oper op)// assume that C is a container of pointers
{
    for (auto& x : c)
        op(x);// pass op() a reference to each element pointed to
}

void user()
{
    std::vector<Shape> v;
    while (std::cin)
        v.push_back(read_shape(std::cin));
    for_all(v,[](Shape& s){ s.draw(); });
    for_all(v,[](Shape& s){ s.rotate(); });
}
int main(){
    user();
}