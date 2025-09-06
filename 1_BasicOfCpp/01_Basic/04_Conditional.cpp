#include<iostream>

using namespace std;
// Write a program to check user age and give them a message
/*
age > 18 => you are an adult
age > 13 and age < 18 => you are a teen agger
age < 13 => you are a kid
*/
int main(){

     // Here we apply conditional statement to write the above program

     int age;
     cout<<"Enter your age -: ";
     cin>>age;
     // cout<<endl;
     if(age>18){
          cout<<"You are an adult";
     }else if(age>13 && age <= 18){
          cout<<"You are a teen agger";
     }else if(age<13){
          cout<<"You are a kid";
     }
     else{
          cout<<"Please enter a valid age ";
     }

     // Note 1. => When you want your program to execute once for a specific condition (use if...else ladder) otherwise you can use multiple if statements but some time it may be very expensive
     return 0;
}