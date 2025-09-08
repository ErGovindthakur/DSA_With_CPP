#include<iostream>
using namespace std;

void RightAngleTrianglePattern(int stars){
     for(int i = 1; i<=stars; i++){
          for(int j = 1; j<=i; j++){
               cout<<"* ";
          }
          cout<<endl;
     }
}
int main () {
     int n;
     cout<<"Enter the number of stars -: ";
     cin>>n;

     RightAngleTrianglePattern(n);
     return 0;
}