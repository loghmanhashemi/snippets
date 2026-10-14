import numpy as np
arr = np.array([[0, 1, 0], 
                [1, 2, -2], 
                [6, 3, 2], 
                [-1, 0, -1], 
                [1, 0, 1]])
print(arr)
arr1= np.dot(arr.T, arr)
arr2= arr.T @ arr
print('*np.dot(arr.T, arr)\n',arr1)
print('*arr.T @ arr\n',arr2)
"""
[[ 0  1  0]
 [ 1  2 -2]
 [ 6  3  2]
 [-1  0 -1]
 [ 1  0  1]]
*np.dot(arr.T, arr)
 [[39 20 12]
 [20 14  2]
 [12  2 10]]
*arr.T @ arr
 [[39 20 12]
 [20 14  2]
 [12  2 10]]

"""