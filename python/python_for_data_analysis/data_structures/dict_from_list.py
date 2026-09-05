def general_make_dic():
    words = ["apple", "bat", "bar", "atom", "book"]
    by_letter = {}
    for word in words:
        letter = word[0]
        if letter not in by_letter:
            by_letter[letter] = [word]
        else:
            by_letter[letter].append(word)
    return by_letter
def pythonic_make_dic():
    words = ["apple", "bat", "bar", "atom", "book"]
    by_letter = {}
    for word in words:
        letter = word[0]
        by_letter.setdefault(letter, []).append(word)
    return by_letter

print(general_make_dic())
print(pythonic_make_dic())