// Now time to deep dive into the array

#include <iostream>

using namespace std;

// creating integer type pointer (*)
int*prepareTeaOrders(int cups){
     int*orders = new int[cups];
     for(int i = 0; i<cups; i++){
          orders[i] = (i+1)*10;
     }
     return orders;
}
int main(){

     // Pointer => It's a data type which stores memory address. Denote by (*=>it's a data type , And &=>it's helps in value context)

     int cups = 5;
     int* chaiOrder = prepareTeaOrders(cups);
     
     for(int i = 0; i<cups; i++){
          cout<<"cups: "<<i+1<<" has "<<chaiOrder[i]<<" ml"<<endl;
     }

     // clean up code
     delete[] chaiOrder;
     return 0;
}