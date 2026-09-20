def apply_to_list(some_list, f):
    return [f(x) for x in some_list]
ints = [4, 0, 1, 5, 6]
print(apply_to_list(ints, lambda x: x * 2))
#[8, 0, 2, 10, 12]
strings = ["foo", "card", "bar", "aaaa", "abab"]
strings.sort(key=lambda x: len(set(x)))
print(strings)
strings.sort(key=lambda x: len(x))
print(strings)