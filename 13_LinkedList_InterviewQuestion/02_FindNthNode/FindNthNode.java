
class Node{
     int data;
     Node next;

     Node(int data){
          this.data = data;
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
          while (temp!=null) {
               System.out.print(temp.data+"=>");
               temp = temp.next;
          }
          System.out.println("null");
     }

     // 1. if head is given find nth from start
     Node getNode(int nIdx){
          Node temp = head;

          for(int i = 0; i<nIdx; i++){
               temp = temp.next;
          }
          return temp;
     }

     // 2. if head is given find nth node from last 
     Node getNodeFromLast(int nIdx){
          Node temp = head;

          for(int i = 1; i<=size-nIdx; i++){
               temp  = temp.next;
          }

          return temp;
     }
}
public class FindNthNode {
     public static void main(String[] args) {
         LinkedList ll = new LinkedList();
         
         ll.insertNode(100);
         ll.insertNode(45);
         ll.insertNode(12);
         ll.insertNode(4);
         ll.insertNode(2);
         ll.insertNode(99);

         ll.display();

         // getting the actual node
         Node dataNode = ll.getNode(2);
         System.out.println("Node at nIdx 2 is => "+dataNode.data);

         // getting nth node from last idx
         Node daNodeFromLast = ll.getNodeFromLast(2);
         System.out.println("Node from last Idx 2 is => "+daNodeFromLast.data);
         System.out.println("Size of above ll => "+ ll.size);
     }
}
