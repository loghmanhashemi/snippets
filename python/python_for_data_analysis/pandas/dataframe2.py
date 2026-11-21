import pandas as pd
import numpy as np
data = {"state": ["Ohio", "Ohio", "Ohio", "Nevada", "Nevada", "Nevada"],
        "year": [2000, 2001, 2002, 2001, 2002, 2003],
        "pop": [1.5, 1.7, 3.6, 2.4, 2.9, 3.2]}
frame2 = pd.DataFrame(data, columns=["year", "state", "pop", "debt"])
print("---------frame2")
print(frame2)
print("---------frame2.columns")
print(frame2.columns)
print('---------frame2["state"]')
print(frame2["state"])
print('---------frame2.year')
print(frame2.year)
print('---------frame2.loc[1]')
print(frame2.loc[1])
print('---------frame2.loc[2]')
print(frame2.iloc[2])
frame2["debt"] = 16.5
print("---------frame2")
print(frame2)
frame2["debt"] = np.arange(6.)
print("---------frame2")
print(frame2)