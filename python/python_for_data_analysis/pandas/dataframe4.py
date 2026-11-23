import numpy as np
import pandas as pd
populations = {"Ohio": {2000: 1.5, 2001: 1.7, 2002: 3.6},"Nevada": {2001: 2.4, 2002: 2.9}}
frame3 = pd.DataFrame(populations)
print(frame3)
print(frame3.T)
pd.DataFrame(populations, index=[2001, 2002, 2003])
pdata = {"Ohio": frame3["Ohio"][:-1],"Nevada": frame3["Nevada"][:2]}
print(pd.DataFrame(pdata))
frame3.index.name = "year"
frame3.columns.name = "state"
print(frame3)
print(frame3.to_numpy())
"""
      Ohio  Nevada
2000   1.5     NaN
2001   1.7     2.4
2002   3.6     2.9
        2000  2001  2002
Ohio     1.5   1.7   3.6
Nevada   NaN   2.4   2.9
      Ohio  Nevada
2000   1.5     NaN
2001   1.7     2.4
state  Ohio  Nevada
year               
2000    1.5     NaN
2001    1.7     2.4
2002    3.6     2.9
[[1.5 nan]
 [1.7 2.4]
 [3.6 2.9]]

"""