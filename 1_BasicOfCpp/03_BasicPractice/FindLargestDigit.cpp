#include <iostream>
#include <cmath>
using namespace std;

// Q 1. Write a C++ program that takes an integer input from the user and finds the largest digit present in that number.

int largestDigit(int num)
{
     num = abs(num); // handles negative and covert it into positive value
     if(num==0)return 0;
     int largeNum = 0;
     while (num > 0)
     {
          int unitDigit = num % 10;
          num = num / 10; // here num decreases

          if (unitDigit > largeNum)
          {
               largeNum = unitDigit;
          }
     }

     return largeNum;
}

int main()
{
     int num;
     // taking input from user
     cout << "Enter the Digit -: ";
     cin >> num;

     int largestNum = largestDigit(num);

     cout << "The largest Digit from input -: " << largestNum << endl;

     // Note => Here Time complexity is O(n) while Space complexity is O(1)
     return 0;
}