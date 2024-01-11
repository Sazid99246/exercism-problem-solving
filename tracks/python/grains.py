"""
This module calculates the number of grains of wheat on each square of a chessboard, and the total number of grains on the entire chessboard. In this scenario, the number of grains on each square doubles compared to the previous one, starting with one grain on the first square.
"""


def square(number):
    """
    Calculate the number of grains of wheat on a given square of a chessboard.

    :param number: int - The square number on the chessboard (must be between 1 and 64 inclusive).
    :return: int - The number of grains on the given square.
    :raises ValueError: If the square number is not within the range of 1 to 64.
    """
    if number < 1 or number > 64:
        raise ValueError("square must be between 1 and 64")
    return 1 << (number - 1)


def total():
    """
    Calculate the total number of grains of wheat on a chessboard.

    :return: int - The total number of grains on the chessboard.
    """
    return (1 << 64) - 1
