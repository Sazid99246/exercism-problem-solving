"""Functions used in preparing Guido's gorgeous lasagna.

Learn about Guido, the creator of the Python language:
https://en.wikipedia.org/wiki/Guido_van_Rossum

This is a module docstring, used to describe the functionality
of a module and its functions and/or classes.
"""


EXPECTED_BAKE_TIME = 40
PREPARATION_TIME = 2


def bake_time_remaining(elapsed_bake_time):
    """
    Calculate the bake time remaining.

    This function takes the elapsed bake time as an argument and subtracts it from the 
    expected bake time (a constant value of 40 minutes) to determine how much baking 
    time is remaining.

    Args:
        elapsed_bake_time (int): The amount of time the baking has already taken in minutes.

    Returns:
        int: The remaining bake time in minutes.
    """
    return EXPECTED_BAKE_TIME - elapsed_bake_time


def preparation_time_in_minutes(number_of_layers):
    """
    Calculate the preparation time in minutes.

    This function computes the time required for preparing the layers based on a constant 
    preparation time per layer (2 minutes per layer). It multiplies the number of layers by 
    the preparation time per layer to find the total preparation time.

    Args:
        number_of_layers (int): The number of layers to prepare.

    Returns:
        int: The total preparation time in minutes.
    """
    return PREPARATION_TIME * number_of_layers


def elapsed_time_in_minutes(number_of_layers, elapsed_bake_time):
    """
    Calculate the total elapsed time in minutes.

    This function sums the total preparation time (determined by the number of layers) and 
    the elapsed bake time to calculate the total elapsed time since the start of the baking 
    process. 

    Args:
        number_of_layers (int): The number of layers to prepare.
        elapsed_bake_time (int): The amount of time the baking has already taken in minutes.

    Returns:
        int: The total elapsed time in minutes.
    """
    return preparation_time_in_minutes(number_of_layers) + elapsed_bake_time
