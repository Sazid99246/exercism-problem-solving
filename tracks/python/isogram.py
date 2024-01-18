def is_isogram(string):
    lowercase_string = string.lower()
    for char in lowercase_string:
        if char in [" ", "-"]:
            continue
        if lowercase_string.count(char) > 1:
            return False
    return True