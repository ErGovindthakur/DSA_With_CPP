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

int gcdEuclidean(int a, int b){
     while (b!=0)
     {
          int temp = b; // temp (1. (18),2.(12),(6))
          b = a%b; // b (1,(12%18 => 12) 2. (18%12=>6),3.(12%6=>0))
          a = temp; // a (1,(18),2.(12),3.(6))
     }
    return a; 
}
int main()
{
     int a = 12;
     int b = 18;

     int gcdCheck = gcdOrHcfBruteForce(a,b);

     cout<<" By Brute Force -: "<<gcdCheck<<endl;

     int gcdCheckByEuclidean = gcdEuclidean(a,b);

     cout<<" By Euclidean -: "<<gcdCheckByEuclidean<<endl;
     return 0;
}