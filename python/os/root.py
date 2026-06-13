import os
if os.getuid() != 0:    
    print("user is not root")
else:
    print("user is root")

#sudo python3 root.py 
#python3 root.py 