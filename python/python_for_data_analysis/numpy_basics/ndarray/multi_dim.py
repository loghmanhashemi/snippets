import numpy as np
data = np.array([[1.5, -0.1, 3], [0, -3, 6.5]])
print(data)
print(data * 10 )
print(data + data)
print(data.shape)
print(data.dtype)
"""
[[ 1.5 -0.1  3. ]
 [ 0.  -3.   6.5]]
[[ 15.  -1.  30.]
 [  0. -30.  65.]]
[[ 3.  -0.2  6. ]
 [ 0.  -6.  13. ]]
(2, 3)
float64

"""