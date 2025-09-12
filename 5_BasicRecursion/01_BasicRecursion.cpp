#include<bits/stdc++.h>
using namespace std;

// Print something n times with the help of recursion

void printNTimes(int num){
     if(num==6)return;

     cout<<num<<endl;
     num++;

     printNTimes(num);


}
int main() {
     
     int num = 1;
     printNTimes(num);
     return 0;
}