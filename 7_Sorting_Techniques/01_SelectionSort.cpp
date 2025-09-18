#include<bits/stdc++.h>
using namespace std;

void selectionSort(int arr[],int n){
     for(int i = 0; i<n-1; i++){
          int min = i;
          for(int j = i; j<n-1; j++){
               if(arr[j]<arr[min]){
                    min = j;
                    // cout<<"Min Value -: "<<min<<endl;
               }
          }
          int temp = arr[min];
          arr[min] = arr[i];
          arr[i] = temp;
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

     selectionSort(arr,n);
     printArr(arr,n);
     return 0;
}