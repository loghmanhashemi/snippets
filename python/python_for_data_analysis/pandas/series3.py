import pandas as pd

#python dictionary:
sdata = {"Ohio": 35000, "Texas": 71000, "Oregon": 16000, "Utah": 5000}
obj3 = pd.Series(sdata)
states = ["California", "Ohio", "Oregon", "Texas"]
obj4 = pd.Series(sdata, index=states)
"""
no value for "California" was found, it appears as NaN (Not a Number).
The isna and notna functions in pandas should be used to detect missing data
"""
print(pd.isna(obj4))
print(pd.notna(obj4))
obj4.isna() # another usage
print("----------------")
print(obj3.to_dict())
print(obj4.to_dict())
print("----------------")
print((obj3 + obj4).to_dict()) # memberwise value add
print("----------------")
obj4.name = "population"
obj4.index.name = "state"
print(obj4)
print("----------------")
obj = pd.Series([4, 7, -5, 3])
obj.index = ["Bob", "Steve", "Jeff", "Ryan"]
print(obj)
"""
California     True
Ohio          False
Oregon        False
Texas         False
dtype: bool
California    False
Ohio           True
Oregon         True
Texas          True
dtype: bool
----------------
{'Ohio': 35000, 'Texas': 71000, 'Oregon': 16000, 'Utah': 5000}
{'California': nan, 'Ohio': 35000.0, 'Oregon': 16000.0, 'Texas': 71000.0}
----------------
{'California': nan, 'Ohio': 70000.0, 'Oregon': 32000.0, 'Texas': 142000.0, 'Utah': nan}
----------------
state
California        NaN
Ohio          35000.0
Oregon        16000.0
Texas         71000.0
Name: population, dtype: float64
----------------
Bob      4
Steve    7
Jeff    -5
Ryan     3
dtype: int64

"""