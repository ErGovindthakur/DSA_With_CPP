#include <bits/stdc++.h>
using namespace std;

int secondLarge(vector<int> arr)
{
     if (arr.size() < 2)
          return arr[0];

     int maxEl = max(arr[0], arr[1]);
     int sMaxEl = min(arr[0], arr[1]);

     for (int i = 0; i < arr.size(); i++)
     {
          if(arr[i]>maxEl){
               sMaxEl = maxEl;
               maxEl = arr[i];
          }

          if(arr[i]>sMaxEl && arr[i]!=maxEl){
               sMaxEl = arr[i];
          }
     }
     return sMaxEl;
}
int main()
{
     vector<int> arr = {9, 2, 5, 1, 3};

     int sLarge = secondLarge(arr);

     cout<<"Second Largest Num -> "<<sLarge<<endl;
     return 0;
}