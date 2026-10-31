import numpy as np
names = np.array(["Bob", "Will", "Joe", "Bob", "Will", "Joe", "Joe"])
print(names)
print(np.unique(names))
ints = np.array([3, 3, 3, 2, 2, 1, 1, 4, 4])
print(np.unique(ints))

print(sorted(set(map(str,names))))
# map(str, names) converts NumPy strings (np.str_) to regular Python strings
values = np.array([6, 0, 0, 3, 2, 5, 6])
# checks set membership
#note in1d is obsolete and is replaced with isin
print(np.isin(values, [2, 3, 6]))
"""
['Bob' 'Will' 'Joe' 'Bob' 'Will' 'Joe' 'Joe']
['Bob' 'Joe' 'Will']
[1 2 3 4]
['Bob', 'Joe', 'Will']
[ True False False  True  True False  True]

"""