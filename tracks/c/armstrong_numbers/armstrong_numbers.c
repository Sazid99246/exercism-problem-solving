
#include "armstrong_numbers.h"
#include <math.h>
bool is_armstrong_number(int candidate)
{
    int tmp = candidate;
    int c = 0;
    while (tmp > 0)
    {
        tmp /= 10;
        c++;
    }
    tmp = candidate;
    int sum = 0;
    while (tmp > 0)
    {
        int d = tmp % 10;
        sum += pow(d, c);
        tmp /= 10;
    }
    return (sum == candidate);
}
