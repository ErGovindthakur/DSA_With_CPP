#include <iostream>
using namespace std;

void symmetricTrianglePattern(int stars)
{
     for (int i = 1; i <= stars; i++)
     {

          for (int k = 1; k <= stars - i; k++)
          { // space print
               cout << " ";
          }

          for (int j = 1; j <= (2 * i) - 1; j++)
          { // actual stars
               cout << "*";
          }

          cout << endl;
     }
}

int main()
{
     int n;
     cout << "Enter the num of stars -: ";
     cin >> n;

     symmetricTrianglePattern(n);
     return 0;
}