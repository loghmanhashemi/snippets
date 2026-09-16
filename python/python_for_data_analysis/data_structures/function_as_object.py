import re
states = ["Alabama ", "Georgia!", "Georgia", "georgia", "FlOrIda",
          "south carolina##", "West virginia?"]

def clean_strings1(strings):
    result = []
    for value in strings:
        value = value.strip()
        value = re.sub("[!#?]", "", value)
        value = value.title()
        result.append(value)
    return result

print(clean_strings1(states))
#['Alabama', 'Georgia', 'Georgia', 'Georgia', 'Florida', 'South Carolina', 'West Virginia']

def remove_punctuation(value):
    return re.sub("[!#?]", "", value)
clean_ops = [str.strip, remove_punctuation, str.title]

def clean_strings2(strings, ops):
    result = []
    for value in strings:
        for func in ops:
            value = func(value)
        result.append(value)
    return result
print(clean_strings2(states, clean_ops))
#['Alabama', 'Georgia', 'Georgia', 'Georgia', 'Florida', 'South Carolina', 'West Virginia']
