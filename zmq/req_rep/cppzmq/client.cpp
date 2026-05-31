#include <zmq.hpp>
#include <iostream>

int main()
{
    zmq::context_t ctx(1);
    zmq::socket_t socket(ctx, zmq::socket_type::req);

    socket.connect("tcp://localhost:5555");

    uint8_t payload[] = {0x10, 0x20, 0x00, 0xFF};

    zmq::message_t msg(payload, sizeof(payload));

    socket.send(msg, zmq::send_flags::none);

    zmq::message_t reply;
    socket.recv(reply, zmq::recv_flags::none);

    std::cout << "Reply size: " << reply.size() << "\n";

    uint8_t* data = static_cast<uint8_t*>(reply.data());

    for (size_t i = 0; i < reply.size(); i++) {
        printf("%02X ", data[i]);
    }
    std::cout << "\n";
}
// g++ client.cpp -lzmq -o client
