def attempt_float(x):
    try:
        return float(x)
    except:
        return x

def attempt_float1(x):
    try:
        return float(x)
    except ValueError:
        return x

def attempt_float2(x):
    try:
        return float(x)
    except TypeError:
        return x

def attempt_float3(x):
    try:
        return float(x)
    except (TypeError, ValueError):
        return x
      

print(attempt_float("1.2345"))  #normal operation


print(attempt_float("something")) #exception catched: returns "something"
print(attempt_float((1, 2))) #exception catched: returns (1,2)



print(attempt_float1("something")) #exception catched: returns "something"

print(attempt_float2((1, 2))) #exception catched: returns (1,2)

print(attempt_float3("something")) #exception catched: returns "something"
print(attempt_float3((1, 2))) #exception catched: returns (1,2)
"""
output:

1.2345
something
(1, 2)
something
(1, 2)
something
(1, 2)
"""
#print(float("something")) #runtime exception: ValueError
#print(float((1, 2))) #runtime exception: TypeError
#print(attempt_float1((1, 2))) #exception didn't catch so caused runtime TypeError
#print(attempt_float2("something")) #exception didn't catch so caused runtime ValueError
