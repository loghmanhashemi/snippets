#include <czmq.h>

int main(void)
{
    zsock_t *socket = zsock_new_req("tcp://localhost:5555");
    assert(socket);

    zstr_send(socket, "Hello");

    char *reply = zstr_recv(socket);
    if (reply) {
        printf("Reply: %s\n", reply);
        zstr_free(&reply);
    }

    zsock_destroy(&socket);
    return 0;
}
//gcc client.c -o client -lczmq