def classify(number):
    """ A perfect number equals the sum of its positive divisors.

    :param number: int a positive integer
    :return: str the classification of the input integer
    """
    divisors = [];
    if number <= 0:
        raise ValueError("Classification is only possible for positive integers.")
    for n in range(1, number):
        if number % n == 0:
            divisors.append(n);
    divisors_sum = sum(divisors);
    if number == divisors_sum:
        return "perfect"
    if number < divisors_sum:
        return "abundant"
    return "deficient"
