
class Node{
     int data;
     Node next;

     Node(int data){
          this.data = data;
     }
}

class DisplayLinkedList{
     int count = 0;
     void display(Node head){
          System.out.println("Display Linked list with function");
          while(head!=null){
               count++;
               System.out.print(head.data+"->");
               head = head.next;
          }
          System.out.println("null");
          System.out.println("Length of linked list -: "+count);
     }
}
public class TraversalOfLinkedList {
   public static void main(String[] args) {
     // creating instance of Node class and putting value
     Node a = new Node(1);
     Node b = new Node(2);
     Node c = new Node(3);

     // linking all nodes together
     a.next = b;
     b.next = c;

     // traversing over linked list
     // creating a temporary Node so that move to next
     Node temp = a;
     System.out.println("Traversal Using for loop");
     for(int i = 1; i<=3; i++){
          System.out.print(temp.data+"->");
          temp = temp.next;
     }
     System.out.println("null");

     // traversal of linked list using while loop, since we don't know the actual size of linked list
     Node temp2 = a;
     // both output will be same
     // System.out.println(temp2);
     // System.out.println(a);
     System.out.println("Traversal using while loop");
     while(temp2!=null){
          System.out.print(temp2.data+"->");
          temp2 = temp2.next;
     }
     System.out.println("null");

     // Now displaying linked list with a function
     DisplayLinkedList dispL = new DisplayLinkedList();
     dispL.display(a);
   }  
}
