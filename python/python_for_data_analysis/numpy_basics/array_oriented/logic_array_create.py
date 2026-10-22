import numpy as np
rng = np.random.default_rng()
arr = rng.standard_normal((4, 4))
print(arr)
print(arr > 0)
print(np.where(arr > 0, 2, -2))
"""
[[-0.44219252  1.37044753  1.37520043 -0.55615063]
 [ 2.55094009 -0.84430414  0.29621929 -0.00384334]
 [-0.65508698  0.7755337   0.76419252 -1.60648291]
 [-0.84469666  1.36551349 -0.94999957  0.1759341 ]]
[[False  True  True False]
 [ True False  True False]
 [False  True  True False]
 [False  True False  True]]
[[-2  2  2 -2]
 [ 2 -2  2 -2]
 [-2  2  2 -2]
 [-2  2 -2  2]]

"""