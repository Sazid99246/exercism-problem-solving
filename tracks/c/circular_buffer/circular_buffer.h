#ifndef CIRCULAR_BUFFER_H
#define CIRCULAR_BUFFER_H

#include <stddef.h>
#include <stdint.h>
#include <stdbool.h>

typedef int buffer_value_t;

typedef struct {
    size_t capacity;
    size_t read, write;
    bool is_empty;
    buffer_value_t values[];
} circular_buffer_t;

circular_buffer_t *new_circular_buffer(size_t capacity);
void delete_buffer(circular_buffer_t *);
void clear_buffer(circular_buffer_t *);
int16_t read(circular_buffer_t *, buffer_value_t *);
int16_t write(circular_buffer_t *, buffer_value_t);
int16_t overwrite(circular_buffer_t *, buffer_value_t);

#endif