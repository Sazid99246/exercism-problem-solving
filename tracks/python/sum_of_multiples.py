def sum_of_multiples(limit, multiples):
    unique_multiples = set()
    for n in multiples:
        if n != 0:
            for i in range(n, limit, n):
                unique_multiples.add(i)
    return sum(unique_multiples)
