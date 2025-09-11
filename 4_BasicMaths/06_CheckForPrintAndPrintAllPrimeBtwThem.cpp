#include <bits/stdc++.h>

using namespace std;

bool checkForPrime(int num)
{
     if (num == 1)
          return false;
     if (num == 2)
          return true;
     if (num % 2 == 0)
          return false;

     for (int i = 3; i <= sqrt(num); i += 2)
     {
          if (num % i == 0)
               return false;
     }
     return true;
}
int main()
{
     int num = 7;
     bool isPrime = checkForPrime(num);
     cout<<( isPrime ? "Prime Num" : "Non-Prime Num")<<endl;
     return 0;
}