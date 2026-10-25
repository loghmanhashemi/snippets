"""
axis=0: Average down the columns.
        Result: one mean per column

axis=1: Average across each row.
        Result: one mean per row        

"""
import numpy as np
rng = np.random.default_rng()
arr = rng.standard_normal((5, 4))
print(arr)
print(arr.mean())
print(np.mean(arr))
print(arr.sum())
print(arr.mean(axis=1))
print(arr.sum(axis=0))  
"""
[[-0.56365778  0.94560883  0.07613821  0.19148061]
 [ 0.48570879  0.05585901  0.674055    0.38758904]
 [-0.34042679 -1.31935887  0.83461495  0.43090294]
 [-0.0029446  -1.17508363  0.24414681 -0.57219744]
 [-0.93803473  0.43121788 -0.0399048  -0.98941113]]
-0.059184884313359755
-0.059184884313359755
-1.183697686267195
[ 0.16239247  0.40080296 -0.09856694 -0.37651971 -0.38403319]
[-1.3593551  -1.06175678  1.78905018 -0.55163598]

"""