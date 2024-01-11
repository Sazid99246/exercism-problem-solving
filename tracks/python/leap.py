"""
Leap Year Calculation Module

This module provides functionality to determine whether a given year is a leap year.
A leap year is a year that is divisible by 4, except for end-of-century years, 
which must be divisible by 400. The module contains the following function:

- leap_year(year): Determines if the specified year is a leap year.
"""


def leap_year(year):
    """Determine whether a specified year is a leap year.

    :params year: int - year to be checked.
    :return: bool - True if the year is a leap year, False otherwise.
    """
    return (year % 4 == 0) and (year % 100 != 0 or year % 400 == 0)
