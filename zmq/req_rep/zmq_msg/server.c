#include <string.h>
#include <stdio.h>
#include <unistd.h>
#include "zmq.h"
int main (int argc, char const *argv[]) {
    void* context = zmq_ctx_new();
    void* socket = zmq_socket(context, ZMQ_REP);
    zmq_bind(socket, "tcp://*:4040");
    printf("Starting…\n");
    for(;;) {
        zmq_msg_t request_msg;
        zmq_msg_init(&request_msg);
        zmq_msg_recv(&request_msg, socket, 0);
        printf("Received: hello\n");
        zmq_msg_close(&request_msg);
        sleep(1); 
        zmq_msg_t reply_msg;
        zmq_msg_init_size(&reply_msg, strlen("world"));
        memcpy(zmq_msg_data(&reply_msg), "world", 5);
        zmq_msg_send(&reply_msg, socket, 0);
        zmq_msg_close(&reply_msg);
    }
    zmq_close(socket);
    zmq_ctx_destroy(context);
    return 0;
}
// gcc server.c -lzmq -o server
