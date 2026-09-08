strings = ["a", "as", "bat", "car", "dove", "python"]
list = [x.upper() for x in strings if len(x) > 2]
print(list)
unique_lengths = {len(x) for x in strings}
print(unique_lengths)
loc_mapping = {value: index for index, value in enumerate(strings)}
print(loc_mapping)