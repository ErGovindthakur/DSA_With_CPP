
// 1. simple node creation
class Node{
     int data;
     Node next;

     // constructor to add node 
     Node(int data){
          this.data = data;
          this.next = null;
     }
}
class LinkedList{
     Node head = null; // first node
     Node tail = null; // last node

     // Adding Node at end 
     void insertAtEnd(int data){
          // calling constructor to add value
          Node temp = new Node(data);
          if(head == null){
               head = temp;
               tail = temp;
          }else{
               tail.next = temp;
               tail = temp;
          }
     }

     // Adding Node at beginning

     void insertAtBeginning(int data){
          Node temp = new Node(data);

          // check if list is empty
          if(head==null){
               head = temp;
               tail = temp;
          }else{
               temp.next = head;
               head = temp;
          }
     }
     // display linked list
     void display(){
          Node temp = head;
          while(temp!=null){
               System.out.print(temp.data+"->");
               temp = temp.next;
          }
          System.out.println("null");
     }

     // size of linked list
     int size(){
          int count = 0;
          Node temp = head;
          while (temp != null) {
              count++;
              temp = temp.next; 
          }
          return count;
     }
}
public class InsertAtEndOfLL {
    public static void main(String[] args) {
     LinkedList ll = new LinkedList();
     // calling insert at end of ll method
     ll.insertAtBeginning(1);
     ll.insertAtEnd(2);
     ll.insertAtEnd(3);
     ll.insertAtBeginning(0);

     // calling display ll method
     ll.display();

     // calling find the length of ll
     int length = ll.size();
     System.out.println("Length of LinkedList -> "+length);
    } 
}
