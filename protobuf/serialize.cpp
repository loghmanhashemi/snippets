#include <iostream>
#include <string>
#include <arpa/inet.h>
#include <unistd.h>
#include <iomanip>
#include "person.pb.h"
int main() {
    GOOGLE_PROTOBUF_VERIFY_VERSION;

    // ---- Create message ----
    Person p;
    p.set_name("Alice");
    p.set_id(123);
    p.add_email("alice@gmail.com");

    // ---- Serialize ----
    std::string buffer;
    p.SerializeToString(&buffer);
    std::cout << "serilized output " << std::endl;
    for(auto c : buffer)
        std::cout <<  std::hex << std::setw(2) << std::setfill('0') << (int)c << " ";
    std::cout << std::endl;    
}