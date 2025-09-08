#include<iostream>
using namespace std;

void arrowPattern(int stars){
     if(stars<=0){
          cout<<"Enter a positive number -: ";
          return ;
     }
     for(int i = 1; i<=stars; i++){
          // increasing triangle
          for(int j = 1; j<=i; j++){
               cout<<"*";
          }
          cout<<endl;
     }
     for(int i = 1; i<stars; i++){
          // decreasing triangle
          for(int k = stars-i; k>=1; k--){
               cout<<"*";
          }
          cout<<endl;
     }
}

int main() {
     int n;
     cout<<"Enter the number of stars -: ";
     cin>>n;
     arrowPattern(n);
     return 0;
}