import numpy as np
arr = np.arange(10)
print(arr)
np.save("some_array", arr)
print(np.load("some_array.npy"))
np.savez("array_archive.npz", a=arr, b=arr) #multiple arrays dictionary like
arch = np.load("array_archive.npz")
print(arch)
print(arch["b"])#access using key(like a map)
np.savez_compressed("arrays_compressed.npz", a=arr, b=arr)