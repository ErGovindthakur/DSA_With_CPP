#include <bits/stdc++.h>

using namespace std;

void checkPalindrome(int num)
{
     int copy = num;
     int revNum = 0;
     while (num > 0)
     {
          int rem = num % 10;
          revNum = (revNum * 10) + rem;
          num = num / 10;
     }
     string isPalindrome = copy == revNum ? "true":"false";
     cout <<isPalindrome << endl;
}

int main()
{
     int num = 131;
     checkPalindrome(num);
     return 0;
}