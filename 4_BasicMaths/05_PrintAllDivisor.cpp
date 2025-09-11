#include<bits/stdc++.h>

using namespace std;

void printAllDivisor(int num){
     for(int i = 1; i<=sqrt(num); i++){
          if(num%i==0){
               cout<<i<<endl;
               if(i != num/i){
                    cout<<num/i<<endl;
               }
          }
     }
}
int main() {
     int num = 124;
     printAllDivisor(num);
     return 0;
}