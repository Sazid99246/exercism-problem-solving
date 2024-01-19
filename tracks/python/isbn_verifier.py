def is_valid(isbn):
    isbn = isbn.replace("-", "")
    if len(isbn) != 10:
        return False

    multiplicador = 1
    total = 0

    if isbn[:-1].isdigit() == False:
        return False
    else:
        for e in isbn:
            if e.isdigit() == True:
                total += int(e) * multiplicador
                multiplicador += 1
            elif e == "X":
                total = total + 100
            else:
                return False

    return total % 11 == 0
