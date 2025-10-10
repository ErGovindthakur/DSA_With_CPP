#include<bits/stdc++.h>
using namespace std;

// 1. brute force
bool checkIsSorted(vector<int>arr){
     for(int i = 0; i<arr.size()-1; i++){
          if(arr[i]>arr[i+1]){
               return false;
          }
     }
     return true;
}
// 2. optimal
bool checkIsSorted2(vector<int>arr,int i){
     if(i>arr.size()-1) return true;
     if(arr[i]> arr[i+1]) return false;

     return checkIsSorted2(arr,i+1);
}
int main() {

     vector<int> arr = {1,3,4};
     vector<int> arr2 = {9,2,1,3,4};

     bool isSorted = checkIsSorted(arr);
     cout<<"Array is sorted part 1 -> "<<isSorted<<endl;
     bool isSorted2 = checkIsSorted2(arr2,0);
     cout<<"Array is sorted part 2 -> "<<isSorted2<<endl;
     return 0;
}