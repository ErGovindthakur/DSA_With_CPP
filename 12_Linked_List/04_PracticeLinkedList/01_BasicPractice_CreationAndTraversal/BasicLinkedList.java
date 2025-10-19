
// linked list creation
class Node{
     int data; // data part
     Node next; // ref of next node (null by default)

     // constructor to add Node
     Node(int data){
          this.data = data;
          this.next = null;
     }
}

class LinkedListNodeCreationAndTraversal{
     // 1. firstly initialize head and tail as null
     Node head = null;
     Node tail = null;

     // 2. Call Node constructor to add node
     void insert(int data){
          Node temp = new Node(data);
          // 3. check if head is null
          if(head == null){
               head = temp;
               tail = temp;
          }else{
               tail.next = temp;
               tail = tail.next;
          }
     }

     // 4. create method to traverse over ll
     void display(){
          Node temp = head;
          while (temp!=null) {
             System.out.print(temp.data+"=>"); 
             temp = temp.next; 
          }
          System.out.println("null");
     }
}

public class BasicLinkedList {
     public static void main(String[] args) {
         // calling Node constructor to add value
     //     Node a = new Node(10);
     //     Node b = new Node(20);
     //     Node c = new Node(30);

         // linking each node together
     //     a.next = b;
     //     b.next = c;
         //c.next = null;// by default (whether write or not)

         // linked list traversal
     //     Node temp = a;
     //     while (temp != null) {
     //      System.out.print(temp.data+"->");
     //      temp = temp.next;
     //     }
     //     System.out.println("null");

     // Second method to insert node in ll and traversal
     LinkedListNodeCreationAndTraversal ll = new LinkedListNodeCreationAndTraversal();

     // inserting data in ll
     ll.insert(10);
     ll.insert(20);
     ll.insert(30);
     ll.insert(40);
     ll.insert(50);

     // traversal over ll
     ll.display();
     }
}
