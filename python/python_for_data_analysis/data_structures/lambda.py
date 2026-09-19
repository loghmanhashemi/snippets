def apply_to_list(some_list, f):
    return [f(x) for x in some_list]
ints = [4, 0, 1, 5, 6]
print(apply_to_list(ints, lambda x: x * 2))
#[8, 0, 2, 10, 12]