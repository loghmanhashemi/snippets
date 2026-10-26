import numpy as np
arr = np.array([0, 1, 2, 3, 4, 5, 6, 7])
print(arr)
print(arr.cumsum())
arr = np.array([[0, 1, 2], [3, 4, 5], [6, 7, 8]])
print(arr)
print(arr.cumsum(axis=0))
print(arr.cumsum(axis=1))
"""
[0 1 2 3 4 5 6 7]
[ 0  1  3  6 10 15 21 28]
[[0 1 2]
 [3 4 5]
 [6 7 8]]
[[ 0  1  2]
 [ 3  5  7]
 [ 9 12 15]]
[[ 0  1  3]
 [ 3  7 12]
 [ 6 13 21]]

"""
