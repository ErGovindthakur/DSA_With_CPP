#include<iostream>
using namespace std;

void rightAngleTriangleWithIncNum(int stars){
     for(int i = 1; i<=stars; i++){
          for(int j = 1; j<=i; j++){
               cout<<j<<" ";
          }
          cout<<endl;
     }
}


int main () {
     int n; 
     cout<<"Enter the num of stars -: ";
     cin>>n;

     rightAngleTriangleWithIncNum(n);
     return 0;
}