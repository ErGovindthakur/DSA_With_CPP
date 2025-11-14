class ArrayStack {
    private int[] arr;
    private int top; // index of next free slot (top = size)

    public ArrayStack(int capacity) {
        arr = new int[capacity];
        top = 0;
    }

    public void push(int x) {
        if (top == arr.length) throw new RuntimeException("Stack overflow");
        arr[top++] = x;
    }

    public int pop() {
        if (top == 0) throw new RuntimeException("Stack underflow");
        return arr[--top];
    }

    public int peek() {
        if (top == 0) throw new RuntimeException("Stack empty");
        return arr[top - 1];
    }

    public boolean isEmpty() { return top == 0; }
    public int size() { return top; }
}

public class StackWithArray {
     public static void main(String[] args) {
          ArrayStack arrStack = new ArrayStack(5);

          arrStack.push(10);
          arrStack.push(20);
          arrStack.push(30);
          arrStack.push(40);
          arrStack.push(50);

          System.out.println("Popped elem -> "+ arrStack.pop());

          int elem = arrStack.peek();
          System.out.println("Peek/Top elem -> "+ elem);

          System.out.println("Is stack empty -> "+ arrStack.isEmpty());

          System.out.println("Size of stack -> "+ arrStack.size());
     }
}
