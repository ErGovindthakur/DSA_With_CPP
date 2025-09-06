#include<iostream>

using namespace std;

int main(){
     // Exploring data types in cpp
     // 1. int (Integer -> holds numeric value of 4 bytes)
     int num = 10;
     // 2. long (Long => holds numeric data of 4 bytes but wider range)
     long longNum = 1242323;
     // 3. long long (Long Long => holds numeric data of 8 bytes)
     long long veryLong = 13124355555;

     // 4. Float (4 byte) , Double (8 byte) (Holds decimal value)
     float dec = 12.23;
     float dc = 12;

     // 5. string and getline
     // string myName;
     // cin>>myName; // It takes only one word
     // cout<<myName<<endl;

     string myFullName;
     cout<<"Enter your fullname -: ";
     getline(cin,myFullName); // it takes complete one line
     cout<<myFullName<<endl;

     // char (1 byte)
     char ch = 'a';
     cin>>ch;
     cout<<ch;
     return 0;
}