#include <czmq.h>

int main(void)
{
    // Create a REP socket (CZMQ handles context internally)
    zsock_t *socket = zsock_new_rep("tcp://*:5555");
    assert(socket);

    printf("Server started on port 5555...\n");

    while (1) {
        char *msg = zstr_recv(socket);   // receive string message
        if (!msg)
            break;

        printf("Received: %s\n", msg);
        zstr_free(&msg);

        zstr_send(socket, "World");      // send reply
    }

    zsock_destroy(&socket);
    return 0;
}
//gcc server.c -o server -lczmq