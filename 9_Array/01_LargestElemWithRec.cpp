#include<bits/stdc++.h>
using namespace std;

int largestNum(vector<int>arr,int i) {
     int size = arr.size();

     // base condition
     if(i==size-1)return arr[i];

     int restMax = largestNum(arr,i+1);
     if(restMax<arr[i]){
          return arr[i];
     }else{
          return restMax;
     }
}
int main() {

     int size;
     cout<<"Enter the size of array -: ";
     cin>>size;

     vector<int> arr(size);
     cout<<"Enter the array elems -: ";
     for(int i = 0; i<size; i++){
          cin>>arr[i];
     }

     int lNum = largestNum(arr,1);
     cout<<"The largest Num -: "<<lNum;
     return 0;
}