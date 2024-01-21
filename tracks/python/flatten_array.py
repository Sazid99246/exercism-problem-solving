def flatten(x):
    try:
        parts = iter(x)
        return [item for part in parts for item in flatten(part)]
    except TypeError:
        return [] if x == None else [x]
