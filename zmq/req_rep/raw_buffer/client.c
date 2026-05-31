#include <zmq.h>
#include <stdio.h>
#include <string.h>

int main(void)
{
    void *context = zmq_ctx_new();
    void *socket = zmq_socket(context, ZMQ_REQ);

    zmq_connect(socket, "tcp://localhost:5555");

    const char *msg = "Hello";
    zmq_send(socket, msg, strlen(msg), 0);

    char buffer[256] = {0};
    zmq_recv(socket, buffer, sizeof(buffer), 0);

    printf("Reply: %s\n", buffer);

    zmq_close(socket);
    zmq_ctx_destroy(context);
    return 0;
}