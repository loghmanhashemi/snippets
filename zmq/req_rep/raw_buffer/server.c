#include <zmq.h>
#include <stdio.h>
#include <string.h>
#include <unistd.h>

int main(void)
{
    void *context = zmq_ctx_new();
    void *socket = zmq_socket(context, ZMQ_REP);

    zmq_bind(socket, "tcp://*:5555");

    while (1) {
        char buffer[256] = {0};

        zmq_recv(socket, buffer, sizeof(buffer), 0);
        printf("Received: %s\n", buffer);

        const char *reply = "World";
        zmq_send(socket, reply, strlen(reply), 0);
    }

    zmq_close(socket);
    zmq_ctx_destroy(context);
    return 0;
}