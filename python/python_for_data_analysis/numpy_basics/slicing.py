import numpy as np
arr = np.arange(10)
print(arr)
print(arr[5:8])
arr[5:8] = 12
print(arr)
arr_slice = arr[5:8]
arr_slice[1] = 12345
print(arr)
arr_slice[:] = 64
print(arr)
"""
[0 1 2 3 4 5 6 7 8 9]
[5 6 7]
[ 0  1  2  3  4 12 12 12  8  9]
[    0     1     2     3     4    12 12345    12     8     9]
[ 0  1  2  3  4 64 64 64  8  9]

"""