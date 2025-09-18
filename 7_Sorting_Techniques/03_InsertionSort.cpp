#include <bits/stdc++.h>
using namespace std;

// insertion sort implementation

void insertionSort(int arr[],int n){
     // starting loop from 1st index 
     for(int i = 1; i<=n; i++){
          int key = arr[i]; // storing each value of arr
          int j = i - 1; // tracking prev value for comparing

          // applying condition to shift value
          while(j>=0 && arr[j]>key){
               // shift 1
               arr[j+1] = arr[j];
               j--;
          }
          // shift 2
          arr[j+1] = key;         
     }
}
// Utility function to print array
void printArr(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
}

int main() {
    int n;
    cout << "Enter the size of array: ";
    cin >> n;

    int arr[n];
    cout << "Enter the elements of array: ";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    cout << "Original array: ";
    printArr(arr, n);

    insertionSort(arr, n);

    cout << "Sorted array: ";
    printArr(arr, n);

    return 0;
}
