### What is Hashing ? 
* Hashing is a way to store and find data quickly.
It works by taking some data (like a name, number, or string) and converting it into a fixed number (called a hash value) which decides where that data will be kept in memory.

### What is Hash function ?
* A hash function is the formula or method that converts your data (key) into a number (index).

### Hashing vs Arrays
#### 🔎 Why Not Just Arrays?

* Arrays are simple, but they have limitations:

* Fixed size → You must know size in advance.

* Index-based access only → Easy to access by index (arr[5]), but not by value (e.g., count how many 5s).

* Searching cost → To check if a value exists, worst case is O(n).

* Sparse data problem → If keys are huge (like user IDs up to 10^9), arrays waste memory.

### ⚡ Why Hashing?
Hashing solves these issues by mapping keys → indexes using a hash function.

* Supports flexible keys (numbers, strings, even objects).

* Fast lookups, insertions, deletions → average O(1).

* Efficient for frequency counting.

* Saves memory for sparse datasets.

### ⏱️ Time Complexity Comparison

| Operation                   | Array (unsorted)                   | Array (sorted)           | Hashing (`unordered_map` / `Map`) |
| --------------------------- | ---------------------------------- | ------------------------ | --------------------------------- |
| Insert element              | O(1) (at end)                      | O(n) (to keep sorted)    | O(1) avg                          |
| Search element              | O(n)                               | O(log n) (binary search) | O(1) avg                          |
| Delete element              | O(n) (shift elements)              | O(n)                     | O(1) avg                          |
| Count frequency of elements | O(n²) naive / O(n log n) with sort | O(n log n)               | O(n)                              |
