import sys
import numpy as np

# Python list
py_list = list(range(1_000_000))

# NumPy array
np_array = np.arange(1_000_000)

print("Python list object:", sys.getsizeof(py_list), "bytes")
print("NumPy array object:", sys.getsizeof(np_array), "bytes")
print("NumPy array data:", np_array.nbytes, "bytes")