#include<iostream>

using namespace std;

int main() {
     // Note => Strings => They are collection of character but not actual array even you can access them using index
     string name = "Striver";
     cout<<name[0]<<endl;
     int len = name.size();
     cout<<name[len - 1]<<endl;
     name[len-1] = 'z';
     cout<<name;
     return 0;
}