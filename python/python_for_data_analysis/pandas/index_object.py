import pandas as pd
import numpy as np
obj = pd.Series(np.arange(3), index=["a", "b", "c"])
index = obj.index
print(index)
print(index[1:])
"""
Index(['a', 'b', 'c'], dtype='object')
Index(['b', 'c'], dtype='object')

"""