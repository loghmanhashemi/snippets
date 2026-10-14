import numpy as np
names = np.array(["Bob", "Joe", "Will", "Bob", "Will", "Joe", "Joe"])
data = np.array([[4, 7], [0, 2], [-5, 6], [0, 0], [1, 2],[-12, -4], [3, 4]])
print("*names: ",names)
print("*data: ",data)
print('*names == "Bob" ',names == "Bob")
print('*data[names == "Bob"]', data[names == "Bob"])
print('*data[names == "Bob", 1:]',data[names == "Bob", 1:])
print('*data[names == "Bob", 1]',data[names == "Bob", 1])
print('*names != "Bob"',names != "Bob")
print('*~(names == "Bob)"',~(names == "Bob"))
print('*data[~(names == "Bob")]',data[~(names == "Bob")])
cond = names == "Bob"
print('*cond = names == "Bob"')
print('*data[~cond]',data[~cond])
mask = (names == "Bob") | (names == "Will")
print('*mask = (names == "Bob") | (names == "Will")')
print('*mask',mask)
print('*data[mask]',data[mask])
print('*data',data)
data[data < 0] = 0
print('*data[data < 0] = 0')
print('*data',data)
data[names != "Joe"] = 7
print('*data[names != "Joe"] = 7')
print('*data',data)
"""
*names:  ['Bob' 'Joe' 'Will' 'Bob' 'Will' 'Joe' 'Joe']
*data:  [[  4   7]
 [  0   2]
 [ -5   6]
 [  0   0]
 [  1   2]
 [-12  -4]
 [  3   4]]
*names == "Bob"  [ True False False  True False False False]
*data[names == "Bob"] [[4 7]
 [0 0]]
*data[names == "Bob", 1:] [[7]
 [0]]
*data[names == "Bob", 1] [7 0]
*names != "Bob" [False  True  True False  True  True  True]
*~(names == "Bob)" [False  True  True False  True  True  True]
*data[~(names == "Bob")] [[  0   2]
 [ -5   6]
 [  1   2]
 [-12  -4]
 [  3   4]]
*cond = names == "Bob"
*data[~cond] [[  0   2]
 [ -5   6]
 [  1   2]
 [-12  -4]
 [  3   4]]
*mask = (names == "Bob") | (names == "Will")
*mask [ True False  True  True  True False False]
*data[mask] [[ 4  7]
 [-5  6]
 [ 0  0]
 [ 1  2]]
*data [[  4   7]
 [  0   2]
 [ -5   6]
 [  0   0]
 [  1   2]
 [-12  -4]
 [  3   4]]
*data[data < 0] = 0
*data [[4 7]
 [0 2]
 [0 6]
 [0 0]
 [1 2]
 [0 0]
 [3 4]]
*data[names != "Joe"] = 7
*data [[7 7]
 [0 2]
 [7 7]
 [7 7]
 [7 7]
 [0 0]
 [3 4]]

"""