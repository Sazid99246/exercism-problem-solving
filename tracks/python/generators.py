"""Functions to automate Conda airlines ticketing system."""


def generate_seat_letters(number):
    """Generate a series of letters for airline seats.

    :param number: int - total number of seat letters to be generated.
    :return: generator - generator that yields seat letters.

    Seat letters are generated from A to D.
    After D it should start again with A.

    Example: A, B, C, D

    """
    letters = list('ABCD')
    i = 0
    while i < number:
        yield letters[i % 4]
        i += 1


def generate_seats(number):
    """Generate a series of identifiers for airline seats.

    :param number: int - total number of seats to be generated.
    :return: generator - generator that yields seat numbers.

    A seat number consists of the row number and the seat letter.

    There is no row 13.
    Each row has 4 seats.

    Seats should be sorted from low to high.

    Example: 3C, 3D, 4A, 4B

    """
    letters_generator = generate_seat_letters(number)
    i = 0
    while i < number:
        letter = next(letters_generator)
        current_row = (i//4) + 1
        row_repr = current_row if current_row < 13 else current_row+1
        yield str(row_repr) + letter
        i += 1


def assign_seats(passengers):
    """Assign seats to passengers.

    :param passengers: list[str] - a list of strings containing names of passengers.
    :return: dict - with the names of the passengers as keys and seat numbers as values.

    Example output: {"Adele": "1A", "Björk": "1B"}

    """

    n_passengers = len(passengers)
    seat_generator = generate_seats(n_passengers)
    return {passenger: seat for passenger, seat in zip(passengers, seat_generator)}


def generate_codes(seat_numbers, flight_id):
    """Generate codes for a ticket.

    :param seat_numbers: list[str] - list of seat numbers.
    :param flight_id: str - string containing the flight identifier.
    :return: generator - generator that yields 12 character long ticket codes.

    """

    return (f'{seat_number}{flight_id}'.ljust(12, '0') for seat_number in seat_numbers)
