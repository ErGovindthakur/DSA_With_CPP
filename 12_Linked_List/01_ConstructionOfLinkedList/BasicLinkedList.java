class Node{
     int data; // It contains "0"
     Node next; // by default contains "null"

     // creating constructor to add value
     Node(int data){
          this.data = data;
          this.next = null;
     }
}
public class BasicLinkedList {
     public static void main(String[] args) {
          // Node x = new Node()
          // System.out.println(x.data); // 0
          // System.out.println(x.next); // null

          Node a = new Node(1);
          Node b = new Node(2);
          Node c = new Node(3);

          a.next = b;
          b.next = c;
          c.next = null;


          // Here both will return same memory address
          System.out.println(a.next);
          System.out.println(b);

          // Here both will return same vale
          System.out.println(a.next.data);
          System.out.println(b.data);

          System.out.println(c.data);
          System.out.println(c.next);
     }
}
