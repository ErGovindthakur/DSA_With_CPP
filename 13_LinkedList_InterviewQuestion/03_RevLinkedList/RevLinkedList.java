
class Node{
     int data;
     Node next;

     Node(int data){
          this.data = data;
          this.next = null;
     }
}
public class RevLinkedList {
     static void ReverseLL(Node temp){
          if(temp == null) return;
          ReverseLL(temp.next);
          System.out.print(temp.data+"=>");
     }
     public static void main(String[] args) {
       Node a = new Node(10); 
       Node b = new Node(20); 
       Node c = new Node(30); 
       Node d = new Node(40); 
       Node e = new Node(50); 

       a.next = b;
       b.next = c;
       c.next = d;
       d.next = e;
       e.next = null;

       Node temp = a;

       while(temp!=null){
          System.out.print(temp.data+"=>");
          temp = temp.next;
       }
       System.out.println("null");
       
       ReverseLL(a);
     }
}
