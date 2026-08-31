empty_dict = {}
d1 = {"a": "some value", "b": [1, 2, 3, 4]}
d1[7] = "an integer" # {'a': 'some value', 'b': [1, 2, 3, 4], 7: 'an integer'}
print(d1["b"])
print("b" in d1) # True
d1[5] = "some value"
d1["dummy"] = "another value"
print(d1)
del d1[5]
print(d1)
ret = d1.pop("dummy")
print(d1)
print(ret)
print(list(d1.keys()))
print(list(d1.values()))
print(list(d1.items())  )
d1.update({"b": "foo", "c": 12})
print(d1)