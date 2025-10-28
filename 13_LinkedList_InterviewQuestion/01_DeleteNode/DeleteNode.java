class Node {
     int data;
     Node next;

     // constructor creation
     Node(int data) {
          this.data = data;
          this.next = null;
     }
}

// creating a linkedList class
class LinkedList {
     // initially linkedList is empty
     Node head = null;
     Node tail = null;
     int size = 0;

     // 1. Insert node at the end of ll
     void insertNode(int data) {
          Node temp = new Node(data);

          if (head == null) {
               head = temp;
               tail = temp;
          } else {
               tail.next = temp;
               tail = temp;
          }
          size++;
     }

     // 2. Traverse and display all nodes of ll
     void display() {
          Node temp = head;
          while (temp != null) {
               System.out.print(temp.data + "=>");
               temp = temp.next;
          }
          System.out.println("null");
     }

     // 3. insert node at beginning of ll
     void insertAtBeginning(int data) {

          Node temp = new Node(data);

          if (head == null) {
               head = temp;
               tail = temp;
          } else {
               temp.next = head;
               head = temp;
          }
          size++;
     }

     // 4. insert node at any index
     void insertAt(int idx, int data) {

          Node temp = new Node(data);
          // check points
          if (idx < 0 || idx > size) {
               System.out.println("Plz enter a valid index number");
               return;
          }

          // a. checking if idx is zero
          if (idx == 0) {
               if (head == null) {
                    head = temp;
                    tail = temp;
               } else {
                    temp.next = head;
                    head = temp;
               }
               size++;
               return;
          }

          // b. checking if idx is size or last index
          Node tHead = head;
          if (idx == size) {
               if (head == null) {
                    head = temp;
                    tail = temp;
               } else {
                    while (tHead.next != null) {
                         tHead = tHead.next;
                    }
                    tHead.next = temp;
                    tail = temp;
               }
               size++;
               return;
          }

          // c. now actual task (insert at any index)
          Node tHead2 = head; // ("I know this is extra one")
          for (int i = 0; i < idx - 1; i++) {
               tHead2 = tHead2.next;
          }
          // System.out.println(tHead2.data);
          temp.next = tHead2.next;
          tHead2.next = temp;
          size++;
     }

     // 5. Delete node from end

     void deleteNode(int idx) {
          // check points
          if (idx < 0 || idx >= size) {
               System.out.println("Plz enter a valid index number");
               return;
          }

          // delete node from 0th index
          if (idx == 0) {
               if (head == null) {
                    System.out.println("Linked list already empty");
                    return;
               } else {
                    head = head.next;
               }
               size--;
               return;
          }

          // delete node from last index
          Node tHead3 = head;
          if (idx == size - 1) {
               for (int i = 0; i < idx - 1; i++) {
                    tHead3 = tHead3.next;
               }
               System.out.println("Last index data => " + tHead3.data);
               tHead3.next = null;
               tail = tHead3;
               size--;
               return;
          }

          // now delete node from any index
          for (int i = 0; i < idx - 1; i++) {
               tHead3 = tHead3.next;
          }
          tHead3.next = tHead3.next.next;
          size--;
     }

     // 6. get node at index
     int getNode(int idx) {
          if (idx < 0 || idx >= size) {
               System.out.println("Invalid index.");
               return -1; // or throw exception
          }
          Node thead = head;
          for (int i = 0; i < idx; i++) {
               thead = thead.next;
          }
          return thead.data;
     }
}

public class DeleteNode {
     public static void main(String[] args) {
          LinkedList ll = new LinkedList();

          ll.insertNode(10);
          ll.insertNode(20);
          ll.insertNode(30);

          ll.insertAtBeginning(9);
          ll.insertAt(0, 8);
          ll.insertAt(ll.size, 40);
          ll.insertAt(3, 11);
          ll.deleteNode(-1);
          ll.deleteNode(0);
          ll.deleteNode(ll.size - 1);
          ll.deleteNode(2);

          int data = ll.getNode(0);
          System.out.println("Node at zero index => " + data);
          ll.display();

          System.out.println("Total size of ll => " + ll.size);
     }
}
