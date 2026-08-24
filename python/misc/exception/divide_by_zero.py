import os


class DivideByZeroEx(Exception):
    pass # empty class


def divide(numerator : int,denominator: int):
    if denominator == 0 :
        raise DivideByZeroEx("my custom exception")
    return numerator/denominator

def try_to_divide():
    try:
        result = divide(1,0)
        print(result)
    except DivideByZeroEx:
        print("divide by zero exception")
        exit(1)

try_to_divide()

