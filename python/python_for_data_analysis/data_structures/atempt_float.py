def attempt_float(x):
    try:
        return float(x)
    except:
        return x


print(attempt_float("1.2345"))
print(attempt_float("something"))
print(float("1.2345"))
print(float("something"))