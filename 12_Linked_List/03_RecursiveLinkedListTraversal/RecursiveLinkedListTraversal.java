
class Node {
     int data;
     Node next;

     // constructor to add value
     Node(int data) {
          this.data = data;
     }
}

// Linked list traversal using recursion
class InnerRecursiveLinkedListTraversal {
     void linkedListTraversal(Node head) {
          if (head == null)
               return;

          System.out.print(head.data + "->");
          linkedListTraversal(head.next);
     }
}

public class RecursiveLinkedListTraversal {
     public static int recursiveLinkedLength(Node head){

          if(head==null) return 0;

          return 1+recursiveLinkedLength(head.next);

     }
     public static void main(String[] args) {
          // creating instance and adding elements
          Node a = new Node(1);
          Node b = new Node(2);
          Node c = new Node(3);

          // linked each node together
          a.next = b;
          b.next = c;

          System.out.println("Linked List traversal using while loop");

          Node temp = a;
          while (temp != null) {
               System.out.print(temp.data + "->");
               temp = temp.next;
          }
          System.out.println("null");

          System.out.println("Linked List traversal using Recursion -> ");
          InnerRecursiveLinkedListTraversal inrLT = new InnerRecursiveLinkedListTraversal();
          inrLT.linkedListTraversal(a);
          System.out.println("null");

          // find length of linked list with recursive function
          Node tempNode = a;
          int length = recursiveLinkedLength(tempNode);
          System.out.println("Length of linked list => "+ length);
     }
}
