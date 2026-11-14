# pip install pandas
import pandas as pd
obj = pd.Series([4, 7, -5, 3])
print(obj)
print('-------------')
print(obj.array)
print(obj.index)
print('-------------')
obj2 = pd.Series([4, 7, -5, 3], index=["d", "b", "a", "c"])
print(obj2)
print(obj2.index)
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
RangeIndex(start=0, stop=4, step=1)
-------------
d    4
b    7
a   -5
c    3
dtype: int64
Index(['d', 'b', 'a', 'c'], dtype='object')


  
"""