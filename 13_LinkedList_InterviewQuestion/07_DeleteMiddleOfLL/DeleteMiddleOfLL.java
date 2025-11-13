class Node{
     int val;
     Node next;

     Node(int val){
          this.val = val;
          this.next = null;
     }
}
class LinkedList{
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

     void display(){
          Node temp = head;

          while(temp!=null){
               System.out.print(temp.val+"=>");
               temp = temp.next;
          }
          System.out.println("null");
     }

     void deleteMiddleNode(){
          Node temp = head;
          if(head==null){
               System.out.println("LL is already empty");
               return;
          }
          for(int i = 0; i<size/2-1; i++){
               temp = temp.next;
          }
          temp.next = temp.next.next;
          // System.out.println("Here is the current mid node -> "+temp.val);
          size--;
     }
}
public class DeleteMiddleOfLL {
  public static void main(String[] args) {
     LinkedList ll = new LinkedList();
     ll.insertNode(1);
     ll.insertNode(3);
     ll.insertNode(4);
     ll.insertNode(7);
     ll.insertNode(1);
     ll.insertNode(2);
     ll.insertNode(6);

     ll.display();
     
     ll.deleteMiddleNode();
     ll.display();

     System.out.println("The size of ll -> "+ ll.size);
  }   
}
