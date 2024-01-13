def response(hey_bob):
    hey_bob = hey_bob.strip()
    if hey_bob.endswith("?"):
        if hey_bob.isupper():
            return "Calm down, I know what I'm doing!"
        return "Sure."
    elif hey_bob.isupper():
        return "Whoa, chill out!"
    elif not hey_bob:
        return "Fine. Be that way!"
    else:
        return "Whatever."
