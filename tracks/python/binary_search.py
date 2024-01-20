def find(search_list: list[int], value: int) -> int:
    high = len(search_list)
    low = 0
    position = high // 2

    while high > low:
        value_at_position = search_list[position]
        if value_at_position == value:
            return position

        if value_at_position < value:
            low = position + 1
        else:
            high = position

        position = (high + low) // 2

    raise ValueError("value not in array")