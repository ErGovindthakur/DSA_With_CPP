#include<bits/stdc++.h>
using namespace std;

void bubbleSort(int arr[],int n){
     for(int i = 0; i<n; i++){
          // adding flag to break the code if array is already sorted
          bool isSwapped = false;
          cout<<"The value of i -> "<<i<<endl;
          for(int j = 0; j<n-i-1; j++){
               // cout<<arr[j]<<", ";
               // cout<<"The value of j -: "<<j<<endl;
               if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
               }
          }
          cout<<"Runs"<<endl;
          if(!isSwapped)break;
     }
}
void printArr(int arr[],int n){
     for(int i = 0; i<n; i++){
          cout<<arr[i]<<" ";
     }
}
int main() {
     int n;
     cout<<"Enter the size of array -: ";
     cin>>n;

     int arr[n];
     cout<<"Enter the array elem -: ";

     for(int i = 0; i<n; i++){
          cin>>arr[i];
     }
     bubbleSort(arr,n);
     printArr(arr,n);
     return 0;
}