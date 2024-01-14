"""
This module provides functionality for calculating a score based on the Euclidean distance
from the origin to a given point. It includes the `score` function, which takes the coordinates
of a point as input and returns a score based on its distance from the origin. The scoring
system is tiered, awarding different points for distances within specific ranges.

The module relies on the `math` library for calculating the Euclidean distance.
"""

import math


def score(x, y):
    """Calculate the score based on the distance from the origin (0, 0) to the point (x, y).

    This function computes the Euclidean distance from the origin to the point (x, y) and
    assigns a score based on this distance. The scoring is as follows:
    - A distance of 1 or less scores 10 points.
    - A distance more than 1 but up to 5 scores 5 points.
    - A distance more than 5 but up to 10 scores 1 point.
    - A distance more than 10 scores 0 points.

    :param x: float - The x-coordinate of the point.
    :param y: float - The y-coordinate of the point.
    :return: int - The score based on the distance of the point from the origin.
    """
    d = math.sqrt((x ** 2) + (y ** 2))
    if d <= 1:
        return 10
    if d <= 5:
        return 5
    if d <= 10:
        return 1
    return 0
