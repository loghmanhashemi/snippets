#include <czmq.h>

int main(void)
{
    zsock_t *req = zsock_new_req("tcp://localhost:5555");
    assert(req);

    // Create binary payload (example packet)
    uint8_t payload[] = {
        0x10, 0x20, 0x00, 0xFF, 0xAB, 0xCD
    };

    zframe_t *frame = zframe_new(payload, sizeof(payload));

    // Send binary frame
    zframe_send(&frame, req, 0);

    // Receive reply frame
    zframe_t *reply = zframe_recv(req);
    if (reply) {
        size_t size = zframe_size(reply);
        uint8_t *data = zframe_data(reply);

        printf("Reply size: %zu\n", size);

        for (size_t i = 0; i < size; i++) {
            printf("%02X ", data[i]);
        }
        printf("\n");

        zframe_destroy(&reply);
    }

    zsock_destroy(&req);
    return 0;
}