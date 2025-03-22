// Exploring everything about class and obj

#include <iostream>
#include <vector>
using namespace std;

// creating our first class

class myDetails{
     public:
     // writing my features
     string myName ;
     int myAge ;
     string myProfession;
     vector <string> mySkills;

     // myFunctionality
     void myFunctionality(){
          cout<<"Hey everyone, I'm "<<myName << " and i'm "<<myAge<< " yrs old.\n"<< "I'm a "<< myProfession<<endl;

          cout<<"Here is my skills what i know "<<endl;

          // Applying forEach loop to print all the values
          for(string skills : mySkills){
               cout<<skills<<endl;
          }
     }
};
int main(){

     // creating an obj to access the class

     myDetails data;

     // adding data to variables
     data.myName = "Er Govind Thakur";
     data.myAge = 20;
     data.myProfession = "Software Developer";

     data.mySkills = {"Javascript","Typescript","Cpp","Go","MERN","React Native"};

     // print all the values through function
     data.myFunctionality();

     return 0;
}