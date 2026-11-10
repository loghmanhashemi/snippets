# pip install pandas
import pandas as pd
obj = pd.Series([4, 7, -5, 3])
print(obj)
print('-------------')
print(obj.array)
"""
0    4
1    7
2   -5
3    3
dtype: int64
-------------
<NumpyExtensionArray>
[4, 7, -5, 3]
Length: 4, dtype: int64


"""