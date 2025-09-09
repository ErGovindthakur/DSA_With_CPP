# 📚 C++ Standard Template Library (STL)

## 🔥 What is STL?
STL = **Standard Template Library**  
It’s a collection of **ready-to-use classes and functions** for data structures and algorithms in C++.  

👉 Instead of writing arrays, linked lists, sorting, searching from scratch → you use STL.  
👉 Think of it as a **toolbox** with efficient, well-tested components.

---

## 🔑 STL Terminology

- **Container** → Objects that store data.  
  Example: `vector`, `list`, `set`, `map`.

- **Iterator** → Like a pointer to traverse elements in containers.  

- **Algorithm** → Predefined functions like sort(), find(), count().
They work with containers using iterators.

- **Functor** → Object that acts like a function. (Useful for custom comparison in sorting, etc.)

```cpp
// Note => Before using STL don't forget to include this two important lines

#include <bits/stdc++.h>
using namespace std;
```