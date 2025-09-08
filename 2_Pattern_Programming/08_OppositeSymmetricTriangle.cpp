#include<iostream>
using namespace std;

void oppositeSymmetricTriangle(int stars){
     if(stars<=0){
          cout<<"Enter positive number";
          return;
     }

     for(int i = stars; i>=1; i--){
          for(int j = i; j<stars; j++){
               // for space printing
               cout<<" ";
          }
          for(int k = (2*i)-1; k>=1; k--){
               cout<<"*";
          }
          cout<<endl;
     }
}
int main() {

     int n;
     cout<<"Enter the number of stars -: ";
     cin>>n;

     oppositeSymmetricTriangle(n);
     return 0;
}