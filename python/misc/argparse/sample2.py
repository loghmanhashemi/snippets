import argparse

parser = argparse.ArgumentParser()

parser.add_argument("filename")

args = parser.parse_args()

print(args.filename)
#python3 sample2.py data.txt