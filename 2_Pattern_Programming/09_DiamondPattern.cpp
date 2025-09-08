#include <iostream>
using namespace std;

void diamond(int stars)
{
     if (stars <= 0)
     {
          cout << "Enter a positive number of stars -: ";
          return;
     }

     // 1. pyramid
     for (int i = 1; i < stars; i++)
     {
          for (int j = stars - i; j >= 1; j--)
          {
               cout << " ";
          }
          for (int k = 1; k <= (2 * i) - 1; k++)
          {
               cout << "*";
          }
          cout << endl;
     }

     // 2. opposite pyramid
     for (int i = stars; i >= 1; i--)
     {
          for (int j = i; j < stars; j++)
          {
               cout << " ";
          }
          for (int k = (2 * i) - 1; k >= 1; k--)
          {
               cout << "*";
          }
          cout << endl;
     }
}
int main()
{
     int n;
     cout << "Enter the number -: ";
     cin >> n;

     diamond(n);
     return 0;
}