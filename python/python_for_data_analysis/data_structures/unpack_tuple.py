tup1 = (4, 5, 6)
a,b,c = tup1
print(b)
tup2 = 4,5,(6,7)
x,y,(z,w) = tup2
print(w)
m,n = 1,2
m,n = n,m #swap
print(n,m)
seq = [(1, 2, 3), (4, 5, 6), (7, 8, 9)]
for a, b, c in seq:
    print(f'a={a}, b={b}, c={c}')
values = 1, 2, 3, 4, 5
a, b, *rest = values
print(rest)
a, b, *_ = values
print(a,b)
a = (1, 2, 2, 2, 3, 4, 2)
print(a.count(2))