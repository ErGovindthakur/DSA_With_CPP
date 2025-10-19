
class Node {
     int data;
     Node next;

     Node(int data) {
          this.data = data;
          this.next = null;
     }
}

class LinkedListInsertAtEnd {
     Node head = null;
     Node tail = null;
     int size = 0;

     void insertNode(int data) {
          Node temp = new Node(data);

          if (head == null) {
               head = temp;
               tail = temp;
          } else {
               tail.next = temp;
               tail = tail.next;
          }
          size++;
     }

     void display() {
          Node temp = head;
          while (temp != null) {
               System.out.print(temp.data + "=>");
               temp = temp.next;
          }
          System.out.println("null");
     }

     // Insert Node at end of ll (since we do this work, when we already have some
     // node in ll)

     void insertNodeAtEnd(int data) {
          Node tHead = head;
          Node temp = new Node(data);

          // check for safety
          if (head == null) {
               insertNode(data);
               return;
          }

          // ****  (above work) if tail is not given **** 
          // now main work (traverse until last node reach)
          while (tHead.next != null) {
               // tHead.next means there is some data in last node
               tHead = tHead.next;
          }
          tHead.next = temp;

          // **** below work if tail is given (Is is correct) *****
          // tail.next = temp;
          // tail = tail.next;
          size++;
     }
}

public class InsertAtEndOfLinkedList {
     public static void main(String[] args) {
          LinkedListInsertAtEnd ll = new LinkedListInsertAtEnd();
          ll.insertNode(10);
          ll.insertNode(20);
          ll.insertNode(30);

          ll.display();
          System.out.println("Total Length of linked list -> " + ll.size);
          ll.insertNodeAtEnd(60);
          ll.display();

          System.out.println("Total Length of linked list -> " + ll.size);
     }
}
