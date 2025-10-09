// Online C++ compiler to run C++ program online
#include <bits/stdc++.h>
using namespace std;

int findLargest(vector <int> arr,int size){
    int max = arr[0];
    
    
    for(int i = 0; i<size; i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
    return max;
}
int main() {
    // Write C++ code here
    cout << "Find Largest elem of array -: "<<endl;
    
    int size;
    cout<<"Enter the size of array -: ";
    cin>>size;

    vector <int> arr(size);
    cout<<"Enter the array elems -: ";

    for(int i = 0; i<size; i++){
     cin>>arr[i];
    }
    int LargeNum = findLargest(arr,size);
    
    cout<<"The largest elem => "<<LargeNum<<endl;
    
    return 0;
}