import numpy as np

arr = np.arange(10)
print('*arr',arr)
print('*np.sqrt(arr)',np.sqrt(arr))
print('*np.exp(arr)',np.exp(arr))
"""
standard_normal(8): generates 8 samples from a normal distribution 
with mean \(0\) and standard deviation \(1\).
"""
rng = np.random.default_rng()
x = rng.standard_normal(8) 
y = rng.standard_normal(8)
print('*np.maximum(x, y',np.maximum(x, y))

"""
[0 1 2 3 4 5 6 7 8 9]
[0.         1.         1.41421356 1.73205081 2.         2.23606798
 2.44948974 2.64575131 2.82842712 3.        ]
[1.00000000e+00 2.71828183e+00 7.38905610e+00 2.00855369e+01
 5.45981500e+01 1.48413159e+02 4.03428793e+02 1.09663316e+03
 2.98095799e+03 8.10308393e+03]
[-1.20260642 -0.28479059  1.37654059  1.48246701  0.71319476  0.8482708
  1.25665721  0.29967753]

"""