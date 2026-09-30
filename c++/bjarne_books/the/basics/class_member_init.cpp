class Vector {
    public:
        Vector(int s);
        double& operator[](int i);
        int size();
        private:
        double* elem; // elem points to an array of sz doubles
        int sz;
};
Vector::Vector(int s) :elem{new double[s]}, sz{s}
{
}

int main(){

}