#include <bits/stdc++.h>
using namespace std;

// find highest and lowest freq elem

void highestAndLowestFreqElem(vector<int> myVec)
{
     map<int, int> freq;

     int maxFreq = INT_MIN;
     int minFreq = INT_MAX;
     // cout << " MaxFreq -: " << maxFreq << " MinFreq -: " << minFreq << endl;

     for (int elem : myVec)
     {
          freq[elem]++;
     }

     // finding max and min freq
     for (auto &it : freq)
     {
          maxFreq = max(maxFreq,it.second);
          minFreq = min(minFreq,it.second);
          // if (it.second > maxFreq)
          // {
          //      maxFreq = it.second;
          //      if (it.second == maxFreq)
          //      {
          //           cout<<"From maxFreq"<<endl;
          //           cout << it.first << " -> " << it.second << endl;
          //      }
          // }
          // if (it.second < minFreq)
          // {
          //      minFreq = it.second;
          //      if (it.second == minFreq)
          //      {
          //           cout<<"From minFreq"<<endl;
          //           cout << it.first << " -> " << it.second << endl;
          //      }
          // }
     }

     // printing max and min freq

     cout<<"Max freq elem \n";
     for(auto &it:freq){
          if(it.second==maxFreq){
               cout<<it.first<<" -> "<<it.second<<endl;
          }
     }
     cout<<"Min freq elem \n";
     for(auto &it:freq){
          if(it.second==minFreq){
               cout<<it.first<<" -> "<<it.second<<endl;
          }
     }
     cout << "MaxFreq -: " << maxFreq << " MinFreq -: " << minFreq << endl;
}
int main()
{
     vector<int> myVec = {1, 2, 3, 3, 1, 3};

     highestAndLowestFreqElem(myVec);
     return 0;
}