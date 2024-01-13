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

print(convert(15))
print(convert(28))
print(convert(34))
