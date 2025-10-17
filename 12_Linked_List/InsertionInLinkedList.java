// 1. Node creation (each node contains data and reference to next node)

class Node{
     // assign to data and reference to next
     int data;
     Node next;

     // runs automatically when new node is created
     Node(int data){
          this.data = data; // assign data
          this.next = null; // if no next node 
     }
}
// 2. Manages linked list (add data and display whatever in ll)

class LinkedListAddDataAndDisplay{
     Node head; // starting point (first node of list), if list is empty , head = null

     // method 1 -> add new node at the end
     void insert(int data){
          // step 1 -> create a new node with given data
          Node newNode = new Node(data);

          // step 2 -> if list is empty new node becomes first node
          if(head == null){
               head = newNode;
               return;
          }
          // step 3 -> otherwise find the last node
          Node temp = head; // start from first node
          while (temp.next != null) {// move forward
               temp = temp.next; // move to the next node
          }

          // step 4 -> list the last node with newNode
          temp.next = newNode;
     }

     // method 2 -> display the linked list data
     void display(){
          Node temp = head;

          // travel until end (null)
          while (temp != null) {
               System.out.print(temp.data+" -> "); // print current node
               temp = temp.next;
          }
          // after end
          System.out.println("null");
     }
}
// 3. main method program starts from here
public class InsertionInLinkedList {
     public static void main(String[] args) {
          LinkedListAddDataAndDisplay list = new LinkedListAddDataAndDisplay();

          // call insert method and add value
          list.insert(10); // 10 -> null
          list.insert(20); // 10->20->null
          list.insert(30); // 10->20->30->null

          // print all elements
          list.display();
     }
}
