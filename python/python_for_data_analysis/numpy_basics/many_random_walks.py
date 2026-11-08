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
crossing_times = (np.abs(walks[hits30]) >= 30).argmax(axis=1)
print(crossing_times)
"""
[[  1   2   1 ...  18  17  16]
 [  1   0   1 ... -48 -49 -48]
 [  1   0  -1 ... -22 -23 -22]
 ...
 [ -1  -2  -3 ... -72 -71 -70]
 [  1   2   1 ...  34  33  34]
 [  1   2   1 ... -22 -23 -22]]
120
-118
[ True  True False ...  True  True False]
3450
[371 447 589 ... 353 383 711]


"""