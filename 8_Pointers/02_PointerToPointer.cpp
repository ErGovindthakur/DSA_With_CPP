#include<bits/stdc++.h>
using namespace std;

int main() {

     // Exploring how to store memory address of one pointer variable to another one

     int num1 = 10;
     int* num2 = &num1;
     cout<<num2<<endl;
     cout<<*num2<<endl;
     int** num3 = &num2;
     cout<<num3<<endl;
     cout<<**num3<<endl;
     return 0;
}