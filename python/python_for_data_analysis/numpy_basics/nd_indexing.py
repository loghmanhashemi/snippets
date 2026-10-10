import numpy as np
arr2d = np.array([[1, 2, 3], [4, 5, 6], [7, 8, 9]])
print("*arr2d[2]:\n" ,arr2d[2])
print("*arr2d[0][2]",arr2d[0][2])
arr3d = np.array([[[1, 2, 3], [4, 5, 6]], [[7, 8, 9], [10, 11, 12]]])
print("*arr3d",arr3d)
print("*arr3d[0]",arr3d[0])
old_values = arr3d[0].copy()
arr3d[0] = 42
print(arr3d)
arr3d[0] = old_values
print("*arr3d",arr3d)
print("*arr3d[1, 0]",arr3d[1, 0])

x = arr3d[1]
print("*x = arr3d[1]")
print("*x",x)
print("*x[0]",x[0])
"""
*arr2d[2]:
 [7 8 9]
*arr2d[0][2] 3
*arr3d [[[ 1  2  3]
  [ 4  5  6]]

 [[ 7  8  9]
  [10 11 12]]]
*arr3d[0] [[1 2 3]
 [4 5 6]]
[[[42 42 42]
  [42 42 42]]

 [[ 7  8  9]
  [10 11 12]]]
*arr3d [[[ 1  2  3]
  [ 4  5  6]]

 [[ 7  8  9]
  [10 11 12]]]
*arr3d[1, 0] [7 8 9]
*x = arr3d[1]
*x [[ 7  8  9]
 [10 11 12]]
*x[0] [7 8 9]
"""