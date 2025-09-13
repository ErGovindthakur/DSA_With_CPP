#include <bits/stdc++.h>
using namespace std;

// find highest and lowest freq elem

void highestAndLowestFreqElem(vector<int> myVec)
{
     map<int, int> freq;

     int maxFreq = (int)-INFINITY;
     int minFreq = (int)INFINITY;
     // cout << " MaxFreq -: " << maxFreq << " MinFreq -: " << minFreq << endl;

     for (int elem : myVec)
     {
          freq[elem]++;
     }

     for (auto &it : freq)
     {
          // cout << it.first << " -> " << it.second << endl;
          if (it.second > maxFreq)
          {
               maxFreq = it.second;
               if (it.second == maxFreq)
               {
                    cout<<"From maxFreq"<<endl;
                    cout << it.first << " -> " << it.second << endl;
               }
          }
          if (it.second < minFreq)
          {
               minFreq = it.second;
               if (it.second == minFreq)
               {
                    cout<<"From minFreq"<<endl;
                    cout << it.first << " -> " << it.second << endl;
               }
          }
     }

     cout << " MaxFreq -: " << maxFreq << " MinFreq -: " << minFreq << endl;
}
int main()
{
     vector<int> myVec = {1, 2, 3, 3, 1, 3};

     highestAndLowestFreqElem(myVec);
     return 0;
}