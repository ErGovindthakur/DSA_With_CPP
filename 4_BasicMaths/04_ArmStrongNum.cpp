#include <bits/stdc++.h>

using namespace std;

void checkArmStrongNum(int num)
{
     int copy = num;
     int armStrongDigit = 0;

     while (num > 0)
     {
          int rem = num % 10;
          int unitSum = 1;
          for (int i = 1; i <= rem; i++)
          {
               unitSum = unitSum * i;
               // cout<<unitSum<<endl;
                    }
          armStrongDigit += unitSum;
          // cout<<armStrongDigit<<endl;
          num = num / 10;
     }
     string isArmStrongNum = copy == armStrongDigit ? "True" : "False";

     cout << isArmStrongNum << endl;
}
int main()
{
     int digit = 145;
     checkArmStrongNum(digit);
     return 0;
}