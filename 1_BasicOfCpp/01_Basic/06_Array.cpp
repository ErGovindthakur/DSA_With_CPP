#include <iostream>
using namespace std;

int main()
{
     // Arrays => Arrays are the collection of simillar data types must starts with 0th index and store value in continuous way like one after another

     // array declaration
     // int arr[5];
     // cin>>arr[0]>>arr[1]>>arr[2]>>arr[3]>>arr[4];
     // cout<<arr[3];
     // cout<<endl;
     // array definition => declaration + initialization
     int myArr[3] = {1, 2, 3};
     cout << myArr[2] << endl;

     // Exploration of 2D Array
     int twoDArray[2][3];
     twoDArray[0][1] = 1; 
     cout << twoDArray[1][2]; 

     return 0;
}