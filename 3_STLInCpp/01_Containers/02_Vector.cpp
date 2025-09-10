#include <bits/stdc++.h>
using namespace std;

int main()
{
     // 1. empty vector
     vector<int> emp;
     // for(int i = 0; i<emp.size(); i++){
     //      cout<<emp[i]<<endl;
     // }
     // 2. vector with size 5 (default with 0)
     vector<int> five(5);
     // 3. vector with size 5 and all elem = 10
     vector<int> sFiveTenElem(5, 10);
     // 4. vector initialization using array style
     vector<int> vecArr = {1, 2, 3, 4, 5};
     // 5. copying one vector with another (copy constructor)
     vector<int> copyCons(vecArr);

     // 2. insert and remove method in vector

     emp.push_back(1);
     emp.push_back(2);
     emp.emplace_back(3); // it is also used to push value from back but bit faster

     // cout<<emp[0]<<endl;
     // cout<<emp[2]<<endl;

     // emp.pop_back();
     // cout<<emp[2]<<endl;

     // 3. Accessing elem
     cout << emp[0] << endl;      // direct check
     cout << emp.at(0) << endl;   // direct check with bound
     cout << emp.front() << endl; // accessing first value
     cout << emp.back() << endl;  // accessing last value

     // 4. iterators in vector
     for (auto i = vecArr.begin(); i != vecArr.end(); i++)
     {
          cout << "Accessing actual elem with * in vecArr -: " << *i << endl; // here star(*) means not accessing index , accessing actual value
     }
     for (auto i = vecArr.rbegin(); i != vecArr.rend(); i++)
     {
          cout << "Accessing actual elem with * in reverse order vecArr -: " << *i << endl;
     }

     // 6. capcity function
     cout << vecArr.size();     // current size
     cout << vecArr.capacity(); // allocated memory
     cout << vecArr.empty();    // true if vector empty
     vecArr.resize(10);         // change size
     vecArr.shrink_to_fit();    // reduce capacity to match size

     // 7. modifiers in vector
     vector<int> v = {1, 2, 3, 4};

     // insert
     v.insert(v.begin() + 2, 100); // [1,2,100,3,4]

     // erase
     v.erase(v.begin() + 1); // [1,100,3,4]

     // clear
     v.clear(); // removes all elements

     // 8. swap in vector
     vector<int> a = {1, 2, 3};
     vector<int> b = {4, 5};
     a.swap(b);
     // a → {4,5}, b → {1,2,3}

     // 9. sorting
     vector<int> sortVec = {4, 1, 5, 3, 2};
     sort(sortVec.begin(), sortVec.end());

     // 10 remove duplicate
     vector<int> v = {1, 2, 2, 3, 3, 3, 4};
     sort(v.begin(), v.end());
     v.erase(unique(v.begin(), v.end()), v.end()); // [1,2,3,4]

     return 0;
}