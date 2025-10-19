class Node{
     int data;
     Node next;

     Node(int data){
          this.data = data;
          this.next = null;
     }
}

class LinkedInsertAtBeginning{
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
               tail = tail.next;
          }
          size++;
     }

     void insertAtBeginning(int data){
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

     void display(){
          Node temp = head;
          while (temp!=null) {
               System.out.print(temp.data+"=>");
               temp = temp.next;
          }
          System.out.println("null");
     }
}
public class InsertAtBeginning {
    public static void main(String[] args) {
     LinkedInsertAtBeginning ll = new LinkedInsertAtBeginning();

     Node a = new Node(8);
     Node b = new Node(9);

     a.next = b;

     ll.insertNode(10);
     ll.insertNode(20);
     ll.insertNode(30);

     ll.display();
     System.out.println("Length of ll => "+ll.size);

     ll.insertAtBeginning(9);
     ll.display();
     System.out.println("Length of ll => "+ll.size);
     ll.insertNode(41);
     ll.display();
     System.out.println("Length of ll => "+ll.size);
    } 
}
