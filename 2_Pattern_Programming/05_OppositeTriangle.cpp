#include<iostream>
using namespace std;

void oppositeTriangle(int stars){
     for(int i = 1; i<=stars; i++){
          for(int j = stars; j>=i; j--){
               cout<<"* ";
          }
          cout<<endl;
     }
}


int main () {
     int n; 
     cout<<"Enter the num of stars -: ";
     cin>>n;

     oppositeTriangle(n);
     return 0;
}