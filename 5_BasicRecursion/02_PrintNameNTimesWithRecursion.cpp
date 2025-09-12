#include <bits/stdc++.h>
using namespace std;

// print name n times with the help or recursion
void printNameNtimes(int num,int count=1)
{
     if (count==num)
     return;
     
     cout << "Govinda " << endl;
     // count++;
     printNameNtimes(num,count+1);
}
int main()
{
     int num = 6;

     printNameNtimes(num);
     return 0;
}