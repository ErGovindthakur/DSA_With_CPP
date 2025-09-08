#include<iostream>
using namespace std;

void printSquare(int stars){
     for(int i = 1; i<=stars; i++){ // prints num of rows
          for(int j = 1; j<=stars; j++){ // prints num of cols
               cout<<"* ";
          }
          cout<<endl;
     }
}
int main() {
     // printing a square (base pattern)

     int n ;
     cout<<"Enter the num of stars -:";
     cin>>n;

     if(n>0){
          printSquare(n);
     }else{
          cout<<"Enter a positive num -: "<<endl;
     }

     return 0;
}