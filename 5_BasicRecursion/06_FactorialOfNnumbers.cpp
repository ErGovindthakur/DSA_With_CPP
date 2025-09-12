#include<iostream>
using namespace std;

int findFactorialOfNnumbers(int num){
     if(num==0)return 1;

     return num *findFactorialOfNnumbers(num-1);
}
int main() {
     int num = 5;
     int findFactorial = findFactorialOfNnumbers(num);
     cout<<findFactorial<<endl;
     return 0;
}