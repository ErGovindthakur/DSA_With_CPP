#include <bits/stdc++.h>
using namespace std;

int findFibonacci(int num){
     if(num==0)return 0;
     if(num==1)return 1;

     return findFibonacci(num-1)+findFibonacci(num-2);
}
int main() {
     int num = 6;
     int findFib = findFibonacci(num);
     cout<<findFib<<endl;
     return 0;
}