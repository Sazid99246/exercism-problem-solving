color_codes = {
    "black": 0, "brown": 1, "red": 2, "orange": 3, "yellow": 4,
    "green": 5, "blue": 6, "violet": 7, "grey": 8, "white": 9
}

tolerance_codes = {
    "grey": "0.05%", "violet": "0.1%", "blue": "0.25%",
    "green": "0.5%", "brown": "1%", "red": "2%",
    "gold": "5%", "silver": "10%"
}


def resistor_label(colors):
    # Handle one band resistor (special case)
    if len(colors) == 1 and colors[0] == "black":
        return "0 ohms"

    # Calculate the resistance value
    resistance = 0
    if len(colors) in [4, 5]:  # For 4 or 5 band resistors
        for i in range(len(colors) - 2):  # Iterate over the first 2 or 3 bands
            resistance = resistance * 10 + color_codes.get(colors[i], 0)
        multiplier = 10 ** color_codes.get(colors[-2], 0)
        resistance *= multiplier
    tolerance = tolerance_codes.get(colors[-1], "")

    # Format the result
    if resistance >= 1000000:
        result = format_resistance(
            resistance / 1000000) + " megaohms ±" + tolerance
    elif resistance >= 1000:
        result = format_resistance(
            resistance / 1000) + " kiloohms ±" + tolerance
    else:
        result = str(resistance) + " ohms ±" + tolerance

    return result


def format_resistance(value):
    if value.is_integer():
        return str(int(value))
    else:
        formatted_value = f"{value:.2f}"
        return formatted_value.rstrip('0').rstrip('.')
