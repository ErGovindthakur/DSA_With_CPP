### 1. What is a Stack? (intuition)

* A stack is a linear data structure that follows LIFO — Last In, First Out.
Think: a stack of plates — you push plates on top, and pop from the top.

* Real-world uses: browser back button, undo in editors, function call stack (recursion), expression evaluation (infix → postfix), DFS.

### 2. Core operations

* push(x) — add element x to the top.

* pop() — remove and return the top element.

* peek() / top() — return top element without removing.

* isEmpty() — check if stack is empty.

* size() — number of elements.

### 3. Stack implementations (conceptual)

* Array-based: fixed-size or dynamic (resize). Fast indexing, contiguous memory.

* Linked-list–based: dynamic size, simpler push/pop at head.

* Using built-in collections: prefer ArrayDeque<E> or Deque<E> in Java instead of legacy Stack<E>.

### 4. Java: built-in choices & recommendation

* java.util.Stack — older class, extends Vector, synchronized (thread-safe) but rarely used in modern code.

* java.util.ArrayDeque (implements Deque) — recommended for stack behavior (push, pop, peek). Faster and not synchronized.

* LinkedList also implements Deque, can be used but ArrayDeque is usually better.

### 🎯 Summary (Interview Ready)
#### Synchronization

→ A mechanism that ensures only one thread can access a critical section at a time.

In java.util.Stack

→ Methods are synchronized because it extends Vector.

Q) Why avoid Stack?

→ Synchronization makes it slow; ArrayDeque is faster and preferred.

Q) When needed?

→ Only in real multithreading scenarios.