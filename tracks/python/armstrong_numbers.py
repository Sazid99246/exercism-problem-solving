"""
This module is dedicated to operations related to Armstrong numbers.

An Armstrong number (also known as a narcissistic number) is a number that is equal to the sum of its own digits each raised to the power of the number of digits. The module provides functionality to check whether a given number is an Armstrong number. This can be useful in various mathematical and educational applications where number theory is involved.

Functions:
- is_armstrong_number(number): Determines if a given number is an Armstrong number.

Example usage:
>>> is_armstrong_number(153)
True
>>> is_armstrong_number(123)
False
"""


def is_armstrong_number(number):
    """
    Check if a given number is an Armstrong number.

    An Armstrong number, also known as a narcissistic number, is a number that is equal to the sum of its own digits each raised to the power of the number of digits. This function determines if the given number falls into this category.

    :param number: int - The number to be checked.
    :return: bool - Returns True if the number is an Armstrong number, False otherwise.
    """

    num_str = str(number)
    result = 0
    for n in num_str:
        result += int(n) ** len(num_str)
    return number == result
