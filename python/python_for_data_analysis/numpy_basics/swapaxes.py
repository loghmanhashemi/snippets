"""
in 2d array same as transpose
"""
import numpy as np
arr = np.arange(24).reshape(2, 3, 4)
print(arr.shape)             # (2, 3, 4)
print(arr.T.shape)           # (4, 3, 2)
print(arr.swapaxes(0, 2).shape)  # (4, 3, 2)
print(arr.swapaxes(0, 1).shape)  # (3, 2, 4)
"""
(2, 3, 4)
(4, 3, 2)
(4, 3, 2)
(3, 2, 4)
"""