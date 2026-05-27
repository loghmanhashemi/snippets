#include <iostream>

__global__ void add( int a, int b, int *c ) { // this code is run on gpu
   *c = a + b;
}
int main( void ) {
   int c;
   int *dev_c;
   cudaMalloc( (void**)&dev_c, sizeof(int) ) ;
   add<<<1,1>>>( 2, 7, dev_c ); //kernel<<<blocks, threads>>>(arguments);
   cudaMemcpy( &c,   dev_c,   sizeof(int),   cudaMemcpyDeviceToHost ) ;// host: cpu , device: gpu
   //printf( "2 + 7 = %d\n", *dev_c ); accessing device memory from cpu is buggy. the corrected version is below
   printf( "2 + 7 = %d\n", c );
   cudaFree( dev_c );
   return 0;
}