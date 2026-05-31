#include <zmq.hpp>
#include <iostream>

int main()
{
    zmq::context_t ctx(1);
    zmq::socket_t socket(ctx, zmq::socket_type::rep);

    socket.bind("tcp://*:5555");

    while (true) {
        zmq::message_t msg;

        socket.recv(msg, zmq::recv_flags::none);

        std::cout << "Received size: " << msg.size() << "\n";

        // access raw binary data
        uint8_t* data = static_cast<uint8_t*>(msg.data());

        for (size_t i = 0; i < msg.size(); i++) {
            printf("%02X ", data[i]);
        }
        std::cout << "\n";

        // reply binary
        uint8_t reply_data[] = {0x01, 0x02, 0x03};

        zmq::message_t reply(reply_data, sizeof(reply_data));

        socket.send(reply, zmq::send_flags::none);
    }
}
//g++ server.cpp -lzmq -o server
