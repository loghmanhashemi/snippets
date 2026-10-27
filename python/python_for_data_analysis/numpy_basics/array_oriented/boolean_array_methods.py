import numpy as np
rng = np.random.default_rng()
arr = rng.standard_normal(10 )
print(arr)
print((arr > 0).sum()) # Number of positive values)
print((arr <= 0).sum()) # Number of non-positive values)
bools = np.array([False, False, True, False])
#any tests whether one or more values in an array is True, 
# while all checks if every value is True
print(bools.any())
print(bools.all())