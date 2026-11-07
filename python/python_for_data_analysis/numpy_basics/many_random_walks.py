import numpy as np
nwalks = 5000
nsteps = 1000
rng = np.random.default_rng()
draws = rng.integers(0, 2, size=(nwalks, nsteps)) # 0 or 1
steps = np.where(draws > 0, 1, -1)
walks = steps.cumsum(axis=1)
print(walks)
print(walks.max())
print(walks.min())
hits30 = (np.abs(walks) >= 30).any(axis=1) # Checks whether at least one element in each row is True. 
"""
    suppose: 
    walks = 
    [10, 20, 25, 15],
    [5, -35, 10, 20],
    [10, 15, 20, 25],
    [-40, 10, 5, 15]
    then:
    hits30 = [False, True, False, True] 
"""
print(hits30)
print(hits30.sum()) # Number that hit 30 or -30
"""
[[  1   0  -1 ... -16 -17 -18]
 [ -1   0  -1 ...  -6  -7  -8]
 [  1   2   1 ... -14 -13 -12]
 ...
 [  1   0  -1 ... -14 -13 -12]
 [  1   2   1 ...   2   1   0]
 [ -1   0   1 ... -26 -25 -24]]

"""