#In contrast with tuples, lists are variable length and their 
# contents can be modified in place
a_list = [2, 3, 7, None]
tup = ("foo", "bar", "baz")
b_list = list(tup)
print(b_list)
b_list[1] = "peekaboo"
print(b_list)
gen = range(10)
print(gen)
print(list(gen))
b_list.append("dwarf")
print(b_list)
b_list.insert(1, "red")
print(b_list)
print(b_list.pop(2))
print(b_list)
b_list.remove("foo")
print(b_list)
print("dwarf" in b_list)
print("dwarf" not in b_list)