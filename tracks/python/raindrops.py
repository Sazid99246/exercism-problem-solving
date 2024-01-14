"""
This module provides a function to convert numbers into a specific string format based on their divisibility.

The primary function in this module, `convert`, takes an integer and returns a string. The string returned depends on the number's divisibility by 3, 5, and 7:
- If the number is divisible by 3, "Pling" is added to the result.
- If the number is divisible by 5, "Plang" is added to the result.
- If the number is divisible by 7, "Plong" is added to the result.
- If the number is not divisible by 3, 5, or 7, the number itself is returned as a string.

Example usage:
    print(convert(15))  # Outputs: "PlingPlang"
    print(convert(28))  # Outputs: "Plong"
    print(convert(34))  # Outputs: "34"
"""


def convert(number):
    """
    Converts a number into a string based on its divisibility.

    The function returns 'Pling' if the number is divisible by 3, 'Plang' if it's divisible by 5,
    and 'Plong' if it's divisible by 7. If the number is not divisible by 3, 5, or 7, the number
    itself is returned as a string.

    :param number: int - The number to be converted.

    :return: str - The resulting string after conversion.
    """
    result = ""
    factors = [(3, "Pling"), (5, "Plang"), (7, "Plong")]

    for factor, sound in factors:
        if number % factor == 0:
            result += sound

    return result if result else str(number)
