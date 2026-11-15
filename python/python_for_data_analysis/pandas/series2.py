import pandas as pd
obj2 = pd.Series([4, 7, -5, 3], index=["d", "b", "a", "c"])
print(obj2)
print("b" in obj2)
print("e" in obj2)
print("---------------")
#python dictionary:
sdata = {"Ohio": 35000, "Texas": 71000, "Oregon": 16000, "Utah": 5000}
obj3 = pd.Series(sdata)
print(obj3)
print(obj3.to_dict())
print("---------------")
states = ["California", "Ohio", "Oregon", "Texas"]
obj4 = pd.Series(sdata, index=states)
print(obj4)
"""
d    4
b    7
a   -5
c    3
dtype: int64
True
False
---------------
Ohio      35000
Texas     71000
Oregon    16000
Utah       5000
dtype: int64
{'Ohio': 35000, 'Texas': 71000, 'Oregon': 16000, 'Utah': 5000}
---------------
California        NaN
Ohio          35000.0
Oregon        16000.0
Texas         71000.0
dtype: float64

"""