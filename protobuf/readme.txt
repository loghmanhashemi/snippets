sudo apt update
sudo apt install protobuf-compiler libprotobuf-dev
protoc --cpp_out=. person.proto
g++ set_get.cpp person.pb.cc -lprotobuf -pthread -o app
g++ serialize.cpp person.pb.cc -lprotobuf -pthread -o app

