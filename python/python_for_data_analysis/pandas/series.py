# pip install pandas
import pandas as pd
obj = pd.Series([4, 7, -5, 3])
print(obj)
print('-------------1')
print(obj.array)
print(obj.index)
print('-------------2')
obj2 = pd.Series([4, 7, -5, 3], index=["d", "b", "a", "c"])
print(obj2)
print(obj2.index)
print('-------------3')
obj2["d"] = 6
print(obj2[["c", "a", "d"]])
print(obj2[obj2 > 0])
print(obj2 * 2)
"""
0    4
1    7
2   -5
3    3
dtype: int64
-------------1
<NumpyExtensionArray>
[4, 7, -5, 3]
Length: 4, dtype: int64
RangeIndex(start=0, stop=4, step=1)
-------------2
d    4
b    7
a   -5
c    3
dtype: int64
Index(['d', 'b', 'a', 'c'], dtype='object')
-------------3
c    3
a   -5
d    6
dtype: int64
d    6
b    7
c    3
dtype: int64
d    12
b    14
a   -10
c     6
dtype: int64
  
"""