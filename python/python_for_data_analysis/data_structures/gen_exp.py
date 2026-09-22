gen = (x ** 2 for x in range(100))
print(sum(gen))
#328350
print(dict((i, i ** 2) for i in range(5)))
#{0: 0, 1: 1, 2: 4, 3: 9, 4: 16}

