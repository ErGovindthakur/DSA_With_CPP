#include <bits/stdc++.h>
using namespace std;

void reverseArray(int arr[], int newArr[], int index, int n)
{
     if (index == n)
          return;

     newArr[index] = arr[n - index - 1];
     reverseArray(arr, newArr, index + 1, n);
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
     return 0;
}