def append_elemnt(some_list,element):
    some_list.append(element)
data = [1,2,3]
append_elemnt(data,4) # call by ref
print(data)
# 1,2,3,4