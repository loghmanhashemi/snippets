nested_tup = (4, 5, 6), (7, 8)
print(nested_tup)
print(nested_tup[0])
print(nested_tup[1])
tup = tuple(['foo',[1,2],True])
#tup[2]=False : error : immutable
tup[1].append(3) # inplace modification is ok
print(tup)

