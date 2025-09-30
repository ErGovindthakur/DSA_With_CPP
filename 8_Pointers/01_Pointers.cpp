#include<bits/stdc++.h>
using namespace std;

int main() {
     // Exploring Pointers very first time
     int num1 = 12;
     int* num2 = &num1;
     // Accessing pointers memory addres
     cout<<num2<<endl;
     // Accessing the actual elem store at the memory location
     cout<<*num2<<endl;
     // Here accessing direct reference of num1
     cout<<&num1<<endl;
     return 0;
}