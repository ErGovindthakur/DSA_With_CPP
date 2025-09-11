#include <bits/stdc++.h>

using namespace std;

int gcdOrHcfBruteForce(int a, int b)
{
     int gcd = 1;
     // cout << min(a, b) << endl;
     for (int i = 1; i <= min(a, b); i++)
     {
          if (a % i == 0 && b % i == 0)
          {
               gcd = i;
          }
     }
     return gcd;
}
int main()
{
     int a = 12;
     int b = 18;

     int gcdCheck = gcdOrHcfBruteForce(a,b);

     cout<<gcdCheck<<endl;
     return 0;
}