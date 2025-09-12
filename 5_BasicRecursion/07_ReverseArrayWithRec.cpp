#include <bits/stdc++.h>
using namespace std;

void reverseArray(int arr[], int newArr[], int index, int n)
{
     if (index == n)
          return;

     newArr[index] = arr[n - index - 1];
     reverseArray(arr, newArr, index + 1, n);
}

void reverseArrayWithBinaryApproach(int arr[], int start, int end)
{
     if (start > end)
          return;

     int temp = arr[start];
     arr[start] = arr[end];
     arr[end] = temp;

     reverseArrayWithBinaryApproach(arr, start + 1, end - 1);
}

void printRevArrayWithBinApp(int arr[], int n)
{
     cout << "Rev array with Binary approach -: " << endl;
     for (int i = 0; i < n; i++)
     {
          cout << arr[i] << " ";
     }
}
int main()
{
     int myArr[] = {1, 2, 3, 4, 5};
     int n = size(myArr);
     int newArr[n];
     reverseArray(myArr, newArr, 0, n);

     for (int i = 0; i < n; i++)
     {
          cout << newArr[i] << " ";
     }
     cout << endl;
     reverseArrayWithBinaryApproach(myArr, 0, n - 1);
     printRevArrayWithBinApp(myArr, n);
     return 0;
}