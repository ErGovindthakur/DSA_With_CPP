#include<bits/stdc++.h>
using namespace std;

// Here function getting copy of the value of num
void numFunc(int num){
     num = num + 10;
}
// Here the function getting the actual memory address of numPtr variable
void numPtrFunc(int* numPtr){ // accepting pointer
     *numPtr = *numPtr + 10;
}
int main() {
     int num = 5;
     cout<<"num before function call -: "<< num<<endl;
     numFunc(num);
     cout<<"num after function call -: "<< num<<endl;

     int numPtr = 10;
     cout<<"numPtr before function call -: "<< numPtr<<endl;
     numPtrFunc(&numPtr);// passing the address
     cout<<"numPtr before function call -: "<< numPtr<<endl;
     return 0;
}