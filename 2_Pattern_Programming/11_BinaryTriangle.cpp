#include <iostream>
using namespace std;

void binaryTriangle(int stars)
{
     if (stars <= 0)
     {
          cout << "Enet positive number ";
          return;
     }

     int num = 1;
     for (int i = 1; i <= stars; i++)
     {
          // 1. Toggling num based on odd and even index
         /*
         if (i % 2 != 0)
         num = 1;
         else
         num = 0;
         for (int j = 1; j <= i; j++)
         {
          cout << num;
          num = 1 - num;
     }
     */ 

     // 2. We can also solve this problem based on i+j % 2

     for(int j = 0; j<i; j++){
          cout<<((i+j)%2);
     }
          cout << endl;
     }
}

int main()
{

     int n;
     cout << "Enter the number of stars -: ";
     cin >> n;

     binaryTriangle(n);
     return 0;
}