#include <bits/stdc++.h>

using namespace std;

// 1. check for strong num
void checkStrongNum(int num)
{
     int copy = num;
     int strongDigit = 0;

     while (num > 0)
     {
          int rem = num % 10;
          int unitSum = 1;
          for (int i = 1; i <= rem; i++)
          {
               unitSum = unitSum * i;
               // cout<<unitSum<<endl;
          }
          strongDigit += unitSum;
          // cout<<armStrongDigit<<endl;
          num = num / 10;
     }
     string isArmStrongNum = copy == strongDigit ? "True" : "False";

     cout << isArmStrongNum << endl;
}

// 2. check armStrongNum

void checkArmStrongNum(int num)
{
     int copy = num;
     int armStrongDigit = 0;

     int countDigit = log10(num) + 1; // actual count ot digits

     while (num > 0)
     {
          int rem = num % 10;
          armStrongDigit += pow(rem, countDigit);
          num = num / 10;
     }

     cout<<armStrongDigit<<endl;
     cout << (copy == armStrongDigit ? "True" : "False") << endl;
}

int main()
{
     int digit = 145;
     cout<<"Strong Num Check -: "<<endl;
     checkStrongNum(digit);
     digit = 153;
     cout<<"armStrong Num Check -: "<<endl;
     checkArmStrongNum(digit);
     return 0;
}

// Note => ArmStrong Num => 153 
// here total digit count = 3, so( 1^3 + 5^3 + 3^3 ) = 153 (correct)