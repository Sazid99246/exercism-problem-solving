color_codes = {"black": 0, "brown": 1, "red": 2, "orange": 3, "yellow": 4,
               "green": 5, "blue": 6, "violet": 7, "grey": 8, "white": 9}


def label(colors):
    # Calculate the resistance value
    first_two_digits = color_codes.get(
        colors[0]) * 10 + color_codes.get(colors[1])
    multiplier = 10 ** color_codes.get(colors[2])
    resistance = first_two_digits * multiplier

    # Format the result
    if resistance >= 1000000000:
        result = f"{resistance // 1000000000} gigaohms"
    elif resistance >= 1000000:
        result = f"{resistance // 1000000} megaohms"
    elif resistance >= 1000:
        result = f"{resistance // 1000} kiloohms"
    else:
        result = f"{resistance} ohms"
    return result


print(label(["red", "black", "red"]))
