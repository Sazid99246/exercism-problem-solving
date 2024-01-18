fun isLeapYear year =
    if year mod 400 = 0 then true
    else if year mod 100 = 0 then false
    else year mod 4 = 0