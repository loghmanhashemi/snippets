import itertools
def first_letter(x):
    return x[0]
names = ["Alan", "Adam", "Wes", "Will", "Albert", "Steven"]
for letter, group in itertools.groupby(names, first_letter):
    print(letter, list(group)) # group is a generator

"""
A ['Alan', 'Adam']
W ['Wes', 'Will']
A ['Albert']
S ['Steven']
"""

