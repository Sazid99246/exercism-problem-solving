color_codes = {"black": 0, "brown": 1, "red": 2, "orange": 3, "yellow": 4,
               "green": 5, "blue": 6, "violet": 7, "grey": 8, "white": 9}

def value(colors):
    codes = ""
    for color in colors[:2]:
        codes += str(color_codes.get(color))
    return int(codes)

print(value(["brown", "green", "violet"]))