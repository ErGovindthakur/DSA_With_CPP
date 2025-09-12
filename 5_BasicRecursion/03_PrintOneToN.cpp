#include <bits/stdc++.h>

using namespace std;

// print 1 to n using recursion
void printOneToN(int num, int count = 1)
{
     if (count == num)
          return;

     cout << count << endl;
     printOneToN(num, count + 1);
}
int main()
{
     int num;
     cout << "Enter the value of n -: ";
     cin >> num;
     printOneToN(num);
     return 0;
}