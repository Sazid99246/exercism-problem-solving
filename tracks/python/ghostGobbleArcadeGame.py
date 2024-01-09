"""
Pac-Man Game Mechanics

This module contains functions that implement the basic rules and mechanics of the classic arcade game Pac-Man. 
It includes functions to determine various game states such as eating ghosts, scoring points, losing, and winning 
the game based on the interactions between Pac-Man and game elements like ghosts, dots, and power pellets.

Functions:
- eat_ghost(power_pellet_active, touching_ghost): Determines if Pac-Man can eat a ghost.
- score(touching_power_pellet, touching_dot): Calculates whether Pac-Man scores by touching a power pellet or a dot.
- lose(power_pellet_active, touching_ghost): Determines if Pac-Man loses the game.
- win(has_eaten_all_dots, power_pellet_active, touching_ghost): Determines if Pac-Man wins the game.

Each function takes specific boolean parameters that represent the current state in the game, such as whether 
Pac-Man is touching a ghost, whether a power pellet is active, or if all dots have been eaten. The functions 
return boolean values that dictate the next state or action in the game.
"""


def eat_ghost(power_pellet_active, touching_ghost):
    """
    Determine if Pac-Man can eat a ghost.

    :param power_pellet_active: - bool - True if a power pellet is active, False otherwise.
    :param touching_ghost: - bool - True if Pac-Man is touching a ghost, False otherwise.
    :returns: bool - True if Pac-Man can eat the ghost, False otherwise.

    This function checks if Pac-Man can eat a ghost based on the game rules. 
    Pac-Man can eat a ghost if he has a power pellet active and is touching a ghost.

    """
    return power_pellet_active and touching_ghost


def score(touching_power_pellet, touching_dot):
    """
    Calculate the scoring event in the game.

    :param touching_power_pellet: bool - True if Pac-Man is touching a power pellet, False otherwise.
    :param touching_dot: bool - True if Pac-Man is touching a dot, False otherwise.
    :return: bool - True if Pac-Man scores by touching either a power pellet or a dot, False otherwise.

    This function checks if Pac-Man scores by touching either a power pellet or a dot.
    Pac-Man scores when he touches a power pellet or a dot.

    """
    return touching_power_pellet or touching_dot


def lose(power_pellet_active, touching_ghost):
    """
    Determine if Pac-Man loses the game.

    This function checks if Pac-Man loses the game, which happens when a power pellet is 
    not active and Pac-Man is touching a ghost.

    :param power_pellet_active: bool - True if a power pellet is active, False otherwise.
    :param touching_ghost: bool - True if Pac-Man is touching a ghost, False otherwise.
    :returns: bool - True if Pac-Man loses the game, False otherwise.
    """
    return not power_pellet_active and touching_ghost


def win(has_eaten_all_dots, power_pellet_active, touching_ghost):
    """
    Determine if Pac-Man wins the game.

    :param has_eaten_all_dots: bool - True if Pac-Man has eaten all dots, False otherwise.
    :param power_pellet_active: bool - True if a power pellet is active, False otherwise.
    :param touching_ghost: bool - True if Pac-Man is touching a ghost, False otherwise.
    :returns: bool - True if Pac-Man wins the game, False otherwise.

    This function checks if Pac-Man wins the game. Pac-Man wins if he has eaten all the dots
    and does not meet the conditions for losing the game (i.e., not having a power pellet active while
    touching a ghost).    
    """
    return has_eaten_all_dots and not lose(power_pellet_active, touching_ghost)
