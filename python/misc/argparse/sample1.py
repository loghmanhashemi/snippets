import argparse

parser = argparse.ArgumentParser()

parser.add_argument("--name")
parser.add_argument("--age", type=int)

args = parser.parse_args()

print(args.name)
print(args.age)
#python3 sample1.py --name ali --age 12
