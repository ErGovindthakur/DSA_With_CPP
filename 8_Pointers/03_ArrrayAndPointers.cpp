#include<bits/stdc++.h>
using namespace std;

int main() {
     int size = 5;
     int arr[size] = {1,2,3,4,5};

     int* arrPtr = arr; // arr is itself a pointer to first element (that's why no need to write "&arr")
     cout<<*arrPtr<<endl; // Here *arrPtr = arr[0]
     cout<<*(arrPtr+1)<<endl;
     int* ptr = nullptr;
     cout<<ptr<<endl; // ptr = 0;


     return 0;
}