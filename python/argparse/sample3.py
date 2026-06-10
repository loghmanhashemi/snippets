import argparse

parser = argparse.ArgumentParser()

parser.add_argument("--port", type=int, default=8080)

args = parser.parse_args()

print(args.port)
#python3 sample3.py --port 8000
