// Exploring 2D array in cpp

#include <iostream>

using namespace std;

int main(){

     // creating 2D Array
     int myTwoDArray[3][4] = {
          {1,2,3,4},
          {5,6,7,8},
          {9,10,11,12}
     };

     // looping through the 2D array
     for(int i = 0; i<3; i++){
          cout<<"Shop 1 is here for Sale -: "<<i+1 << " day"<<endl;
          for(int j=0; j<4; j++){
               cout<<"Here is the Sale of Day -: "<< myTwoDArray[i][j]<<endl;
          }
     }
     return 0;
}