def general_get(key,some_dict):
    default_value = 0
    if key in some_dict:
        value = some_dict[key]
    else:
        value = default_value
    return value

def python_get(key,some_dict):
    default_value = 0
    value = some_dict.get(key, default_value)
    return value