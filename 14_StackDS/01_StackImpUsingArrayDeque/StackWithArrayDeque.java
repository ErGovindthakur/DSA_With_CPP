import java.util.ArrayDeque;
import java.util.Deque;

public class StackWithArrayDeque {
     public static void main(String[] args) {
          Deque <Integer> stack = new ArrayDeque<>();

          // 1. push (Elem into the stack)

          stack.push(10);
          stack.push(20);
          stack.push(30);

          // 2. checking top elem of stack without removing (using peek)
          System.out.println("Top elem of stack -> "+stack.peek());

          // 3. Removing top elem of stack using pop
          System.out.println("Removed Top elem of stack -> "+stack.pop());

          // 4. checking if stack is empty or not
          System.out.println("Is stack empty -> "+stack.isEmpty());

          // 5. checking the size of stack using size()
          System.out.println("The size of given stack is -> "+stack.size());
     }
}
