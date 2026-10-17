import numpy as np
rng = np.random.default_rng()
arr = rng.standard_normal(7) * 5
print(arr)
remainder, whole_part = np.modf(arr)
print(remainder)
print(whole_part)
out = np.zeros_like(arr)
print(out)
print(np.add(arr, 1))
np.add(arr, 1, out=out)
print(out)
"""
[-2.41030567  8.86970336 -5.95725913  4.00277657 -0.09300415  1.08873409
  3.46069606]
[-0.41030567  0.86970336 -0.95725913  0.00277657 -0.09300415  0.08873409
  0.46069606]
[-2.  8. -5.  4. -0.  1.  3.]
[0. 0. 0. 0. 0. 0. 0.]
[-1.41030567  9.86970336 -4.95725913  5.00277657  0.90699585  2.08873409
  4.46069606]
[-1.41030567  9.86970336 -4.95725913  5.00277657  0.90699585  2.08873409
  4.46069606]

"""


