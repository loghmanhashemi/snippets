from IPython.lib.pretty import pretty
a = "foo bar"
print(getattr(a, "split"))
print(pretty(getattr(a, "split")))
print(getattr(a, "split")())
