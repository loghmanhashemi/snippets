path="list.txt"
with open(path, mode="rb") as f:
    chars = f.read(10)
print(chars)
print(len(chars))
with open(path, mode="rb") as f:
    data = f.read(10)
print(data)
print(data.decode("utf-8"))