#include<bits/stdc++.h>
using namespace std;

int printSumOfNnumbers(int num){
     // if(num<1)return 0;
     // return num+printSumOfNnumbers(num-1);
     if(num>7)return 0;
     return num+printSumOfNnumbers(num+1);
}
int main() {
     int num = 1;
     int sumOfNnumbers = printSumOfNnumbers(num);
     cout<<sumOfNnumbers<<endl;
     return 0;
}