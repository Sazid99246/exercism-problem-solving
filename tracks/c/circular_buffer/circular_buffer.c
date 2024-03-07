#include "circular_buffer.h"
#include <stdlib.h>
#include <stddef.h>
#include <stdint.h>
#include <stdbool.h>
#include <errno.h>

circular_buffer_t *new_circular_buffer(size_t capacity)
{
    circular_buffer_t *buf = malloc(sizeof *buf + sizeof(buffer_value_t) * capacity);
    buf->capacity = capacity;
    buf->read = buf->write = 0;
    buf->is_empty = true;
    return buf;
}

void delete_buffer(circular_buffer_t *buf)
{
    free(buf);
}

void clear_buffer(circular_buffer_t *buf)
{
    buf->read = buf->write = 0;
    buf->is_empty = true;
}

int16_t read(circular_buffer_t *buf, buffer_value_t *x)
{
    if (buf->is_empty)
    {
        errno = ENODATA;
        return EXIT_FAILURE;
    }
    *x = buf->values[buf->read++ % buf->capacity];
    buf->read %= buf->capacity;
    buf->is_empty = (buf->read == buf->write);
    return EXIT_SUCCESS;
}

int16_t write(circular_buffer_t *buf, buffer_value_t x)
{
    if (buf->read == buf->write && !buf->is_empty)
    {
        errno = ENOBUFS;
        return EXIT_FAILURE;
    }
    buf->is_empty = false;
    buf->values[buf->write++] = x;
    buf->write %= buf->capacity;
    return EXIT_SUCCESS;
}

int16_t overwrite(circular_buffer_t *buf, buffer_value_t x)
{
    if (buf->read == buf->write && !buf->is_empty)
    {
        buf->values[buf->write++] = x;
        buf->read = buf->write %= buf->capacity;
    }
    else
    {
        buf->is_empty = false;
        buf->values[buf->write++] = x;
        buf->write %= buf->capacity;
    }
    return EXIT_SUCCESS;
}