class Node{
     int data;
     Node next;

     Node(int data){
          this.data = data;
          this.next = null;
     }
}

class LinkedListInsertAtAnyIndex{
     Node head = null;
     Node tail = null;
     int size = 0;

     void insertNode(int data){
          Node temp = new Node(data);

          if(head==null){
               head = temp;
               tail = temp;
          }else{
               tail.next = temp;
               tail = temp;
          }
          size++;
     }

     void insertAtAnyIdx(int idx, int data){

          if(idx<0 || idx>size){
               System.out.println("Pls enter valid index");
               return;
          }

          if(idx==size){
               insertNode(data);
               return;
          }

          if(idx==0){
               Node temp = new Node(data);
               temp.next = head;
               head = temp;
               if(tail==null)tail=temp;
               size++;
               return;
          }
          Node temp = new Node(data);
          Node t = head;
          for(int i = 0; i<idx-1; i++){
               t = t.next;
          }
          temp.next = t.next;
          t.next = temp;
          size++;
     }

     void display(){
          Node temp = head;
          while(temp!=null){
               System.out.print(temp.data+"=>");
               temp = temp.next;
          }
          System.out.println("null");
     }
}
public class InsertNodeAtAnyIndex {
    public static void main(String[] args) {
     LinkedListInsertAtAnyIndex ll = new LinkedListInsertAtAnyIndex();

     ll.insertNode(10);
     ll.insertNode(20);
     ll.insertNode(30);

     ll.display();
     System.out.println("Length of ll => "+ll.size);
     
     ll.insertAtAnyIdx(2, 9);
     ll.display();
     System.out.println("Length of ll => "+ll.size);
    }
}
