// Now time to deep dive into the array

#include <iostream>

using namespace std;

int totalTeaServed(int tea[],int size){
     int total = 0;

     for(int i = 0; i < size; i++){
          total =total + tea[i];
     }
     return total;
}

int main(){

     // int teaTemperature[3] = {51,72,45};

     // // Applying for loop to iterate over array
     // for(int i = 0; i<3; i++){
     //      cout<<teaTemperature[i]<<endl;
     // }


     int teaServed[5] = {1,2,3,4,5};
     int size = 5;

     int total = totalTeaServed(teaServed,size);
     cout<<total<<endl;
     return 0;
}