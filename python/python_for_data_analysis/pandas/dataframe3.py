import pandas as pd
import numpy as np
data = {"state": ["Ohio", "Ohio", "Ohio", "Nevada", "Nevada", "Nevada"],
        "year": [2000, 2001, 2002, 2001, 2002, 2003],
        "pop": [1.5, 1.7, 3.6, 2.4, 2.9, 3.2]}
frame2 = pd.DataFrame(data, columns=["year", "state", "pop", "debt"])
print("---------frame2")
print(frame2)
val = pd.Series([-1.2, -1.5, -1.7], index=["two", "four", "five"])
print("---------val")
print(val)
frame2["debt"] = val
# all is NaN because indexes dont match : 
#DataFrame index : 0 1 2 3 ...
#Series index: "two", "four", "five"
print("---------frame2")
print(frame2)
val = pd.Series([-1.2, -1.5, -1.7], index=[1, 3, 5])
frame2["debt"] = val
print("---------frame2")
print(frame2)
frame2["eastern"] = frame2["state"] == "Ohio"
print("---------frame2")
print(frame2)
del frame2["eastern"]
print(frame2.columns)
"""
---------frame2
   year   state  pop debt
0  2000    Ohio  1.5  NaN
1  2001    Ohio  1.7  NaN
2  2002    Ohio  3.6  NaN
3  2001  Nevada  2.4  NaN
4  2002  Nevada  2.9  NaN
5  2003  Nevada  3.2  NaN
---------val
two    -1.2
four   -1.5
five   -1.7
dtype: float64
---------frame2
   year   state  pop  debt
0  2000    Ohio  1.5   NaN
1  2001    Ohio  1.7   NaN
2  2002    Ohio  3.6   NaN
3  2001  Nevada  2.4   NaN
4  2002  Nevada  2.9   NaN
5  2003  Nevada  3.2   NaN
---------frame2
   year   state  pop  debt
0  2000    Ohio  1.5   NaN
1  2001    Ohio  1.7  -1.2
2  2002    Ohio  3.6   NaN
3  2001  Nevada  2.4  -1.5
4  2002  Nevada  2.9   NaN
5  2003  Nevada  3.2  -1.7
---------frame2
   year   state  pop  debt  eastern
0  2000    Ohio  1.5   NaN     True
1  2001    Ohio  1.7  -1.2     True
2  2002    Ohio  3.6   NaN     True
3  2001  Nevada  2.4  -1.5    False
4  2002  Nevada  2.9   NaN    False
5  2003  Nevada  3.2  -1.7    False
Index(['year', 'state', 'pop', 'debt'], dtype='object')

"""