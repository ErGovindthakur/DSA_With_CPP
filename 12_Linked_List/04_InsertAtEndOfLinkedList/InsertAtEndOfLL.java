
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
     int n = 0;
     // 1. Adding Node at end 
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
          n++;
     }

     // 2. Adding Node at beginning

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
          n++;
     }
     // 3. display linked list
     void display(){
          Node temp = head;
          while(temp!=null){
               System.out.print(temp.data+"->");
               temp = temp.next;
          }
          System.out.println("null");
     }

     //4. size of linked list
     // int size(){
     //      int count = 0;
     //      Node temp = head;
     //      while (temp != null) {
     //          count++;
     //          temp = temp.next; 
     //      }
     //      return count;
     // }

     // 5. insert node at any specific index
     void insertAt(int idx, int data){
          Node newNode = new Node(data); // going to be inserted
          Node temp = head; // copy of head
          if(idx==n){
               insertAtEnd(data);
               return;
          }else if(idx==0){
               insertAtBeginning(data);
               return;
          }else if(idx<0 || idx>n){
               System.out.println("Plz enter correct Index");
               return;
          }
          // traversal until exact prev node
          for(int i = 1; i<=idx-1; i++){
               temp = temp.next;
          }
          // inserting the node
          newNode.next = temp.next;
          temp.next = newNode;
          n++;
     }
     // 6. get data at index
     int getAt(int idx){
          if(idx<0 || idx>=n){
               System.out.println("Pls enter valid index number");
               return -1;
          }
          Node temp = head;
          for(int i = 0; i<idx; i++){
               temp = temp.next;
          }
          return temp.data;
     }
     // 7. delete at index
     void deleteAt(int idx){
          // for deleting 0th index
          if(idx==0) head = head.next;

          Node temp = head;
          for(int i = 0; i<idx; i++){
               temp = temp.next;
          }
          temp.next = temp.next.next;
          tail = temp;
          n--;
     }

}
public class InsertAtEndOfLL {
    public static void main(String[] args) {
     LinkedList ll = new LinkedList();
     // calling insert at end of ll method
     ll.insertAtBeginning(1);
     ll.insertAtEnd(2);
     ll.insertAtEnd(3);
     ll.insertAtEnd(11);
     ll.insertAtEnd(7);
     ll.insertAt(3, 4);
     ll.insertAt(9, 9);
     ll.insertAtBeginning(0);

     // deleting at any index
     ll.deleteAt(4);
     ll.deleteAt(0);
     // System.out.println(ll.head.data);
     // calling display ll method
     ll.display();

     // calling find the length of ll
     int length = ll.n;
     System.out.println("Length of LinkedList -> "+length);

     // get elem at particular index
     int elem = ll.getAt(2);
     System.out.println("Elem at index 2 -> "+elem);
    } 
}
