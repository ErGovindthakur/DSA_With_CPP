#include<bits/stdc++.h>
using namespace std;

int main() {
     int* p = new int; // allocating memory
     *p = 25; // assigning value
     cout<<*p<<endl;
     delete p; // freeing dynamic memory allocation
     return 0;
}