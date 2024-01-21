def sequence(number):
    numbers = []
    for i in range(number + 1):
        numbers.append(i)
    return numbers


def square_of_sum(number):
    sequence_of_numbers = sequence(number)
    return sum(sequence_of_numbers) ** 2


def sum_of_squares(number):
    sequence_of_numbers = sequence(number)
    result = 0
    for n in range(number + 1):
        result += n ** 2
    return result


def difference_of_squares(number):
    return square_of_sum(number) - sum_of_squares(number)
