#include<iostream>
using namespace std;

void rightAngleTriangleWithIncNum(int stars){
     int n = 1;
     for(int i = 1; i<=stars; i++){
          for(int j = 1; j<=i; j++){
               cout<<n<<" ";
          }
          n++;
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