def squares(n=10):
    print(f"Generating squares from 1 to {n ** 2}")
    for i in range(1, n + 1):
        yield i ** 2

gen = squares()
for x in gen:
    print(x, end=" ")
#Generating squares from 1 to 100
#1 4 9 16 25 36 49 64 81 100