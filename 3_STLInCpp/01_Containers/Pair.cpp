#include<bits/stdc++.h>
using namespace std;

void explainPair(){
     pair<int,int> intP = {1,3};
     cout<<intP.first << " " << intP.second<<endl;

     pair<int,pair<int,int>> nestedPair = {1,{1,3}};
     cout<<nestedPair.first<<" "<<nestedPair.second.first<<endl;

     pair<int,int> pairArr[] = {{1,2},{2,3},{3,4},{4,5}};
     cout<<pairArr[0].first;
}
int main() {
     explainPair();
     return 0;
}