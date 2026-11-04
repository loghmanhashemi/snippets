import numpy as np
nwalks = 5000
nsteps = 1000
rng = np.random.default_rng()
draws = rng.integers(0, 2, size=(nwalks, nsteps)) # 0 or 1
steps = np.where(draws > 0, 1, -1)
walks = steps.cumsum(axis=1)
print(walks)
"""
[[  1   0  -1 ... -16 -17 -18]
 [ -1   0  -1 ...  -6  -7  -8]
 [  1   2   1 ... -14 -13 -12]
 ...
 [  1   0  -1 ... -14 -13 -12]
 [  1   2   1 ...   2   1   0]
 [ -1   0   1 ... -26 -25 -24]]

"""