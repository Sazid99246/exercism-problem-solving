"""Functions used in preparing Guido's gorgeous lasagna.

Learn about Guido, the creator of the Python language:
https://en.wikipedia.org/wiki/Guido_van_Rossum

This is a module docstring, used to describe the functionality
of a module and its functions and/or classes.
"""


EXPECTED_BAKE_TIME = 40
PREPARATION_TIME = 2


def bake_time_remaining(elapsed_bake_time):
    """Calculate the bake time remaining.

    :param elapsed_bake_time: int - baking time already elapsed.
    :return: int - remaining bake time (in minutes) derived from 'EXPECTED_BAKE_TIME'.

    Function that takes the actual minutes the lasagna has been in the oven as
    an argument and returns how many minutes the lasagna still needs to bake
    based on the `EXPECTED_BAKE_TIME`.
    """

    return EXPECTED_BAKE_TIME - elapsed_bake_time


def preparation_time_in_minutes(number_of_layers):
    """Calculate the preparation time in minutes.

    :param number_of_layers: int - number of layers to be prepared.
    :return: int - time to bake the layers (in minutes) derived from 'PREPARATION_TIME'.

    Function that takes the number of layers as an argument and returns 
    how many minutes all the layers need to be prepared 
    based on the `PREPARATION_TIME`.
    """

    return PREPARATION_TIME * number_of_layers


def elapsed_time_in_minutes(number_of_layers, elapsed_bake_time):
    """
    :param number_of_layers: int - The number of layers to prepare.
    :elapsed_bake_time: int - The amount of time the baking has already taken in minutes.
    :return: int - The total elapsed time in minutes.

    Calculate the total elapsed time in minutes.

    This function sums the total preparation time (determined by the number of layers) and 
    the elapsed bake time to calculate the total elapsed time since the start of the baking 
    process. 
    """
    return preparation_time_in_minutes(number_of_layers) + elapsed_bake_time
