#include <iostream>
using namespace std;

void triangleAndItsMirror(int stars)
{
     // Condition to prevent num of stars
     if (stars <= 0 || stars >= 9)
     {
          cout << "Enter a positive num of stars but less than 10 -: ";
          return;
     }

     // Here num2 will keep remains but provide their value to copy
     int num2 = 0;
     for (int i = stars; i >= 1; i--)
     {
          num2++;
          int copy = num2;
          int num1 = 1;
          // 1. forward Triangle
          for (int j = stars - 1; j >= i - 1; j--)
          {
               cout << num1++;
          }
          // 2. printing space
          for (int s = (2 * i - 1); s > 1; s--)
          {
               cout << " ";
          }
          // 3. print mirror pattern
          for (int j = stars - 1; j >= i - 1; j--)
          {
               cout << copy--;
          }
          cout << endl;
     }
}
int main()
{
     int n;
     cout << "Enter the num of stars -: ";
     cin >> n;

     triangleAndItsMirror(n);
     return 0;
}