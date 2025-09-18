#include<bits/stdc++.h>
using namespace std;

void printNToOne(int num){
     if(num<1)return;

     cout<<num<<endl;
     num--;
     printNToOne(num);
}
int main() {
     int num = 7;
     printNToOne(num);
     return 0;
}