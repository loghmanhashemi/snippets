import numpy as np
#random number following normal(Gaussian) distribution with mean 0 and variance 1
print(np.random.standard_normal())
# just keeping generation of randoms 7 times and populating a list
data = [np.random.standard_normal() for i in range(7)]
print(data)
#generating 10 randoms, different approach
data = np.random.standard_normal(10) 
print(data)