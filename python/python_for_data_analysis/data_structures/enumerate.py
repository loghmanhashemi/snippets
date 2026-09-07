words = ["apple", "banana", "orange"]

for i, word in enumerate(words):
    print(i, word)

for i, word in enumerate(words, start=1):
    print(i, word)

seq1 = ["foo", "bar", "baz"]
seq2 = ["one", "two", "three"]

for index, (a, b) in enumerate(zip(seq1, seq2)):
    print(f"{index}: {a}, {b}")

