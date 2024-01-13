"""
This module implements the Collatz Conjecture algorithm.

The Collatz Conjecture, also known as the 3n + 1 conjecture, is a mathematical conjecture
that applies to any positive integer. According to this conjecture, when an integer is even,
it is divided by 2, and when it is odd, it is multiplied by 3 and incremented by 1. This process
repeats until the number becomes 1. The `steps` function in this module calculates the number of steps
required for a given positive integer to reach 1 following these rules.

Functions:
    steps(number): Calculate the number of steps to reach 1 in the Collatz sequence for a given positive integer.
"""


def steps(number):
    """
    Calculate the number of steps required to reach 1 in the Collatz sequence.

    This function implements the Collatz conjecture, which modifies the input number
    based on whether it's even or odd. The process repeats until the number becomes 1.
    It raises a ValueError if the input is not a positive integer.

    :param number: int - A positive integer to apply the Collatz sequence to.
    :return: int - The number of steps taken to reach 1.
    :raises ValueError: If 'number' is not a positive integer.
    """
    if number <= 0:
        raise ValueError("Only positive integers are allowed")
    steps = 0
    while number != 1:
        if number % 2 == 0:
            number /= 2
        else:
            number = 3 * number + 1
        steps += 1
    return steps
