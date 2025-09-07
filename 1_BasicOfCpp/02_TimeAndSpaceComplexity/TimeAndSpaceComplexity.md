# ⏱️ Time & Space Complexity Notes

## ⚡ What is Time Complexity?
Time complexity tells you **how the runtime of an algorithm grows** as input size (`n`) increases.  
It is usually expressed in **Big O notation**:

- **O(1)** → Constant time  
- **O(log n)** → Logarithmic (e.g., Binary Search)  
- **O(n)** → Linear  
- **O(n log n)** → Log-linear (e.g., Merge Sort, QuickSort avg.)  
- **O(n²), O(n³)** → Quadratic, Cubic (e.g., nested loops)  
- **O(2ⁿ), O(n!)** → Exponential (e.g., brute-force recursion, permutations)  

---

## ⚡ What is Space Complexity?
Space complexity measures **how much extra memory** an algorithm uses relative to input size.  

It includes:
- Input storage  
- Auxiliary space (extra variables, data structures)  
- Function call stack (important in recursion)  

---

## 🔑 Quick Tips to Analyze Complexity

### 1. Look at loops
- A single loop over `n` elements → **O(n)**  
- Nested loop → **O(n²)**  
- Loop halving the problem each time → **O(log n)**  

Example:
```js
for (let i = 0; i < n; i++)       // O(n)
    for (let j = 0; j < n; j++)   // O(n)
        console.log(i, j);        // O(n²)
