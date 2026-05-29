compilation syntax:
 g++ -std=c++20 -fmodules-ts -xc++-system-header iostream
 g++ -std=c++20 -fmodules-ts -c hello.cpp
 g++ -std=c++20 -fmodules-ts -c main.cpp
 g++ hello.o main.o -o app

 