### 1. What is pointer ?
1. A pointer is a variable that stores the memory address of another variable.

### 2. Key Operators

1.  & → “Address of” operator (gets memory address).

2. *(astrict) → “Dereference” operator (gets value at address).

### 3. Pointer to Pointer
* Storing memory of one pointer variable into another one
```cpp
int num1 = 10;
int* num2 = &num1;
int** num3 = &num2;
```
### 4. Null Pointers
. If a pointer is not assigned an address, always initialize it to NULL (or nullptr in modern C++).
```cpp
int* ptr = nullptr; // safer than int* p = NULL;
```

### 5. Pointers and Arrays

. Arrays work very closely with pointers.
```cpp
int arr[3] = {10, 20, 30};
int* p = arr; // arr is itself a pointer to first element

cout << *p << endl;     // 10
cout << *(p+1) << endl; // 20
cout << *(p+2) << endl; // 30

// Note -> arr[i] is just syntactic sugar for *(arr + i)
```

### 6. Pointers with Functions
. If you pass variables directly → function gets a copy.
. If you pass pointers → function can modify the original value.

