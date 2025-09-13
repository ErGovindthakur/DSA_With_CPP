#include <bits/stdc++.h>
using namespace std;

// find frequency of array elements

void freqElem(int arr[], int n)
{
     // putting the elems of array into map
     map<int, int> myMap;
     for (int i = 0; i < n; i++)
     {
          myMap[arr[i]]++;
     }
     // iterating over map
     for (auto it : myMap)
     {
          cout << it.first << " -> " << it.second << endl;
     }
}
int main()
{
     int n;
     cout << "Enter the size of array -: ";
     cin >> n;

     int arr[n];
     cout << "Enter the elems of array -: ";
     for (int i = 0; i < n; i++)
     {
          int elem;
          cin >> elem;
          arr[i] = elem;
     }
     // calling function
     freqElem(arr, n);
     return 0;
}