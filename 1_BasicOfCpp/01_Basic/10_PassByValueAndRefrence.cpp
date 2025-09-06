#include <iostream>

using namespace std;

// pass by value
void addNum(int num)
{
     cout << num << endl;
     num += 5;
     cout << num << endl;
     num += 5;
     cout << num << endl;
     num += 5;
}

// pass by reference
void showName(string &name)
{ // & => symbol says , you have apply changes on actual value not copy
     name[0] = 't';
     cout << "Name coming from showName function " << name << endl;
}

// pass by reference with array
void updateArr(int arr[],int size){
     for(int i = 0; i<=size-1; i++){
          arr[i] += 10;
     }
}

int main()
{
     int num = 10;
     addNum(num);
     // Here the above same number is getting increased , but behind the scene it's passing the copy af actual value not real value
     cout << "The actual num value -: " << num << endl;

     string name = "raj";
     showName(name);
     cout << "Actual lexical name -: " << name << endl;

     int size = 5;
     int arr[size] = {1,2,3,4,5};

     cout<<"Original array before update -:"<<endl;
     for(int i = 0; i<size; i++){
          cout<<arr[i]<<", ";
     }
     cout<<endl;
     
     updateArr(arr,size);
     cout<<"Original array after update -:"<<endl;
     for(int i = 0; i<size; i++){
          cout<<arr[i]<<", ";
     }

     return 0;
}