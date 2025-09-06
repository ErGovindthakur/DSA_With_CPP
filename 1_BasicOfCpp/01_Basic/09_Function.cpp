#include<iostream>
using namespace std;

/*
Functions are set of code which performs something for you.
Functions are used to modularize code
Functions are used to increase readability
Functions are used to use same code multiple times

********** Types of functions ************
1. void -> which doesn't return anything
2. return -> It returns some values (any data types)
3. parameterized -> It contains some params
4. non parameterized
*/

// 1. void function
void sayHello(){
     cout<<"Hello"<<endl;
}

// 2. return function
int addTwoNum(){
     int c = 2+3;
     return c;
}

// 3. parameterized function
string greet(string name){
     return "Hey " + name;
}

int main() {
     // Here invoking void function
     sayHello();
     // Here invoking return function
     int addTwoNums = addTwoNum();
     cout<<addTwoNums<<endl;
     // Here invoking parameterized function with return
     string name = "Govind";
     string greetMe = greet(name);
     cout<<greetMe<<endl;
     
     return 0;
}