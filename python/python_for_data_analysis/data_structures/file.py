path="list.txt"
f = open(path, encoding="utf-8")
for line in f:
    print(line)
f.close()

lines = [x.rstrip() for x in open(path, encoding="utf-8")]
#file is not explicitly closed
#open() returns a file object, and the list comprehension iterates over it
print(lines)

with open(path, encoding="utf-8") as f:
    lines = [x.rstrip() for x in f]
#This will automatically close the file f when exiting the with block
print(lines)