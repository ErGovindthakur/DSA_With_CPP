// basic node class creation
class Node {
     int data;
     Node next;

     Node(int data) {
          this.data = data;
          this.next = null;
     }
}

// normal stack class
class LinkedStack {
     private Node head; // top of stack (why private is it mandatory => not any need but a good
                        // practice)

     public LinkedStack() { // purpose of this constructor (if i am not wrong LinkedStack is created head
                            // must be null, since cons always called once)
          head = null;
     }

     // pushing node in stack
     public void push(int data) {
          Node n = new Node(data);
          n.next = head;
          head = n;

     }

     // removing top node returning value
     public int pop() {
          if (head == null)
               throw new RuntimeException("Empty");

          int data = head.data;

          head = head.next;
          return data;

     }

     // returning top most node of stack
     public int peek() {
          if (head == null)
               throw new RuntimeException("Empty");

          return head.data;
     }

     // checking if stack is empty or not
     public boolean isEmpty() {
          return head == null; // if head is equal to null? true : false;
     }
}

public class StackWithLinkedList {
     public static void main(String[] args) {
          LinkedStack lStack = new LinkedStack();

          // pushing value in lStack
          lStack.push(10);
          lStack.push(20);
          lStack.push(30);

          // popping or removing top most elem and return
          System.out.println("popped elem -> " + lStack.pop());
          System.out.println("popped elem -> " + lStack.pop());

          // checking top most elem of stack
          System.out.println("Top most elem of stack -> " + lStack.peek());

          // checking if stack is empty or not
          System.out.println("Is stack empty or not -> " + lStack.isEmpty());
     }
}
