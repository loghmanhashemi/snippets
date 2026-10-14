import numpy as np
import timeit

my_arr = np.arange(1_000_000)
my_list = list(range(1_000_000))
print( timeit.timeit( lambda: my_arr * 2 , number=1000))


