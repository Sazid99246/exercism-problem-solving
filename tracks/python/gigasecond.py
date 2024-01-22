from datetime import datetime, timedelta

def add(moment):
    return moment + timedelta(seconds=10**9)

print(add(datetime(2011, 4, 25, 0, 0)))