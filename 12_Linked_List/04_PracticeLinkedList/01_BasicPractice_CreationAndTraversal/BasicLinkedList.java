
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

public class BasicLinkedList {
     public static void main(String[] args) {
         // calling Node constructor to add value
         Node a = new Node(10);
         Node b = new Node(20);
         Node c = new Node(30);

         // linking each node together
         a.next = b;
         b.next = c;
         //c.next = null;// by default (whether write or not)

         // linked list traversal
         Node temp = a;
         while (temp != null) {
          System.out.print(temp.data+"->");
          temp = temp.next;
         }
         System.out.println("null");
     }
}
