// Online C++ compiler to run C++ program online
#include <bits/stdc++.h>
using namespace std;

void printTriangleWithChar(int ch){
    for(int i = 1; i<=ch; i++){
        for(int j = 65; j<65+i; j++){
            cout<<char(j);
        }
        cout<<endl;
    }
}
int main() {
    
   int n;
   cout<<"Enter the value of ch -: ";
   cin>>n;
   printTriangleWithChar(n);
    return 0;
}