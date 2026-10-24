import numpy as np
rng = np.random.default_rng()
arr = rng.standard_normal((4, 4))
print(arr)
print(arr > 0)
print(np.where(arr > 0, 2, -2))
print(np.where(arr > 0, 2, arr)) # set only positive values to 2
"""
[[-1.10443422 -0.77750746  0.20380662  0.4206771 ]
 [-2.00759633 -0.62521373  2.3013523  -0.02162873]
 [-0.03188491 -0.25166361  0.27393354  0.76255649]
 [-1.51947609 -0.2887128  -1.64426895 -0.40024376]]
[[False False  True  True]
 [False False  True False]
 [False False  True  True]
 [False False False False]]
[[-2 -2  2  2]
 [-2 -2  2 -2]
 [-2 -2  2  2]
 [-2 -2 -2 -2]]
[[-1.10443422 -0.77750746  2.          2.        ]
 [-2.00759633 -0.62521373  2.         -0.02162873]
 [-0.03188491 -0.25166361  2.          2.        ]
 [-1.51947609 -0.2887128  -1.64426895 -0.40024376]]

"""