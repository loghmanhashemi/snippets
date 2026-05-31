#include <string.h>
#include <stdio.h>
#include <unistd.h>
#include "zmq.h"
int main (int argc, char const *argv[]) {
    void* context = zmq_ctx_new();
    printf("Client Starting….\n");
    void* socket = zmq_socket(context, ZMQ_REQ);
    zmq_connect(socket, "tcp://localhost:4040");
    int count = 0;
    for(;;) {
        zmq_msg_t req_msg;
        zmq_msg_init_size(&req_msg, strlen("hello"));
        memcpy(zmq_msg_data(&req_msg), "hello", 5);
        printf("Sending: hello - %d\n", count);
        zmq_msg_send(&req_msg, socket, 0);
        zmq_msg_close(&req_msg);
        zmq_msg_t reply;
        zmq_msg_init(&reply);
        zmq_msg_recv(&reply, socket, 0);
        printf("Received: hello - %d\n", count);
        zmq_msg_close(&reply);
        count++;
    }
    // We never get here though.
    zmq_close(socket);
    zmq_ctx_destroy(context);
    return 0;
}
// gcc client.c -lzmq -o client