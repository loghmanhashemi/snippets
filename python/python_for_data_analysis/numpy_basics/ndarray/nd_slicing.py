import numpy as np
arr = np.array([0,1,2,3,4,64,64,64,8,9])
print("*arr ",arr)
print("*arr[1:6])",arr[1:6])
arr2d =  np.array( [[1, 2, 3],
                   [4, 5, 6],
                   [7, 8, 9]])
print("*arr2d ",arr2d)

print("*arr2d[:2]",arr2d[:2])

print("*arr2d[:2, 1:]",arr2d[:2, 1:])
lower_dim_slice = arr2d[1, :2]
print("*lower_dim_slice = arr2d[1, :2]")
print(lower_dim_slice.shape)
print("*arr2d[:2, 2]",arr2d[:2, 2])
print("*arr2d[:, :1]",arr2d[:, :1])
arr2d[:2, 1:] = 0
print("*arr2d",arr2d)
"""
*arr  [ 0  1  2  3  4 64 64 64  8  9]
*arr[1:6]) [ 1  2  3  4 64]
*arr2d  [[1 2 3]
 [4 5 6]
 [7 8 9]]
*arr2d[:2] [[1 2 3]
 [4 5 6]]
*arr2d[:2, 1:] [[2 3]
 [5 6]]
*lower_dim_slice = arr2d[1, :2]
(2,)
*arr2d[:2, 2] [3 6]
*arr2d[:, :1] [[1]
 [4]
 [7]]
*arr2d [[1 0 0]
 [4 0 0]
 [7 8 9]]
"""