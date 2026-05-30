#include <iostream>
#include "person.pb.h"

int main() {
    // Create object
    Person p;

    // ---- SET values ----
    p.set_name("Alice");
    p.set_id(123);

    p.add_email("alice@gmail.com");
    p.add_email("alice@work.com");

    // ---- GET values ----
    std::cout << "Name: " << p.name() << std::endl;
    std::cout << "ID: " << p.id() << std::endl;

    std::cout << "Emails:" << std::endl;
    for (const auto& email : p.email()) {
        std::cout << "  " << email << std::endl;
    }

    return 0;
}