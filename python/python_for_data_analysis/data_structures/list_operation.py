print([4, None, "foo"] + [7, 8, (2, 3)])
x = [4, None, "foo"]
x.extend([7, 8, (2, 3)])
print(x)
a = [7, 2, 5, 1, 3]
print(a)
print(a.sort())
print(a)
b = ["saw", "small", "He", "foxes", "six"]
print(b)
b.sort(key=len)
print(b)
seq = [7, 2, 3, 7, 5, 6, 0, 1]
print(seq)
print(seq[1:5])# [2,3,7,5] : include 1 exclude 5
print(seq[3:])# [6, 3, 6, 0, 1]
print(seq[-4:]) #[3, 6, 0, 1] 
print(seq[-6:-2]) # [3, 6, 3, 6]
print(seq[::2]) # use step 2 means tyake every other element: [7, 3, 5, 0]
print(seq[::-1]) # make list reversed: [1, 0, 6, 5, 7, 3, 2, 7]
