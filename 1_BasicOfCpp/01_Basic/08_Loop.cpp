#include<iostream>

using namespace std;

int main() {
     // Loops (iterator) => They help us to do such type of task which are repetitive

     int i=1;
     // for(i=1; i<=5; i++){
     //      cout<<"Value of i " << i << endl;
     // }
     // // Here loop breaks at index 6
     // cout<<"Last value of i "<< i<<endl;

     // same task using while
     // while (i<=5)
     // {
     //      cout<<"Value of i "<<i<<endl;
     //      i++;
     // }
     // cout<<"Value of i ends here "<<i<<endl;
     

     // same things using do while loop
     do{
          cout<<"Value of i "<<i<<endl;
          i++;
     }while (i<=5);
     cout<<"Value of i ends here "<<i<<endl;


     // Note 1. => For and while loops are called entry point loop , they won't work until and unless the condition satisfied.

     // Note 2. => Do{}while() loop called exit point loop it will work atleast once even if the condition is false
     return 0;
}