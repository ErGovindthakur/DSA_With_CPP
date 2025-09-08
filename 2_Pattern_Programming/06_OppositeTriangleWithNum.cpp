#include<iostream>
using namespace std;

void oppositeTriangleNum(int stars){
     for(int i = stars; i>=1; i--){
          for(int j = 1; j<=i; j++){
               cout<<j;
          }
          cout<<endl;
     }
}


int main () {
     int n; 
     cout<<"Enter the num of stars -: ";
     cin>>n;

     oppositeTriangleNum(n);
     return 0;
}