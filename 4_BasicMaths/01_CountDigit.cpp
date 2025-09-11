#include <bits/stdc++.h>
using namespace std;

void countDigit(int digit)
{
     if (digit < 2)
     {
          cout << "Enter more than two digit ";
     }
     int sum = 0;
     int count = 0;
     while (digit > 0)
     {
          int rem = digit % 10;
          sum += rem;
          digit = digit / 10;
          count++;
     }
     cout << "Total Digit -: " << sum << " Total count -: " << count << endl;
}
int main()
{
     int num = 12345;
     countDigit(num);
     return 0;
}