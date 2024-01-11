"""
Triangle Type Determination Module.

This module provides functions to determine the type of a triangle based on the lengths of its sides.
It includes checks for the validity of a triangle and determines whether it is equilateral, isosceles, or scalene.

Functions:
- triangle(sides): Determines if the given sides can form a valid triangle.
- equilateral(sides): Checks if a triangle is equilateral (all sides equal).
- isosceles(sides): Checks if a triangle is isosceles (at least two sides equal).
- scalene(sides): Checks if a triangle is scalene (all sides different).
"""


def triangle(sides):
    """
    Determines if the given sides can form a valid triangle.

    :param sides: list of int or float - lengths of the three sides of a potential triangle.
    :return: bool - True if the sides can form a triangle, False otherwise.
    """
    if sides[0] > 0 and sides[1] > 0 and sides[2] > 0:
        if (sides[0] + sides[1]) >= sides[2] and (sides[1] + sides[2]) >= sides[0] and (sides[0] + sides[2]) >= sides[1]:
            return True
    return False


def equilateral(sides):
    """
    Checks if a triangle is equilateral, meaning all sides are equal.

    :param sides: list of int or float - lengths of the three sides of the triangle.
    :return: bool - True if the triangle is equilateral, False otherwise.
    """
    return triangle(sides) and sides[0] == sides[1] and sides[1] == sides[2]


def isosceles(sides):
    """
    Checks if a triangle is isosceles, meaning at least two sides are equal.

    :param sides: list of int or float - lengths of the three sides of the triangle.
    :return: bool - True if the triangle is isosceles, False otherwise.
    """
    return triangle(sides) and (sides[0] == sides[1] or sides[1] == sides[2] or sides[0] == sides[2])


def scalene(sides):
    """
    Checks if a triangle is scalene, meaning all sides are different.

    :param sides: list of int or float - lengths of the three sides of the triangle.
    :return: bool - True if the triangle is scalene, False otherwise.
    """
    return triangle(sides) and (sides[0] != sides[1] and sides[1] != sides[2] and sides[0] != sides[2])
