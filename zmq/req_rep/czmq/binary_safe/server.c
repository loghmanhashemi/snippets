#include <czmq.h>

int main(void)
{
    zsock_t *socket = zsock_new_rep("tcp://*:5555");
    assert(socket);

    printf("Server running...\n");

    while (1) {
        // Receive raw binary frame
        zframe_t *frame = zframe_recv(socket);
        if (!frame)
            break;

        size_t size = zframe_size(frame);
        uint8_t *data = zframe_data(frame);

        printf("Received packet size: %zu\n", size);

        // Example: print hex dump
        for (size_t i = 0; i < size; i++) {
            printf("%02X ", data[i]);
        }
        printf("\n");

        // Send binary reply (IMPORTANT: must create frame)
        const char reply_data[] = {0x01, 0x02, 0x03, 0x04};
        zframe_t *reply = zframe_new(reply_data, sizeof(reply_data));

        zframe_send(&reply, socket, 0);

        zframe_destroy(&frame);
    }

    zsock_destroy(&socket);
    return 0;
}