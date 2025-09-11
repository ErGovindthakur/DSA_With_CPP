#include<bits/stdc++.h>

using namespace std;

void revNum(int num){
     int revDigit=0;

     while(num>0){
          int rem = num%10;
          revDigit = (revDigit*10)+rem;
          num = num/10;
     }
     cout<<revDigit<<endl;
}
int main() {
     int num = 125;
     revNum(num);
     return 0;
}