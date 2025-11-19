class Node {
     int val;
     Node next;

     Node(int val) {
          this.val = val;
          this.next = null;
     }
}

class LinkedList {
     // 1. First Node
     Node head1 = null;
     Node tail1 = null;
     int size1 = 0;

     // 2. Second Node
     Node head2 = null;
     Node tail2 = null;
     int size2 = 0;

     void insertNode1(int val) {
          Node temp1 = new Node(val);
          if (head1 == null) {
               head1 = temp1;
               tail1 = temp1;
          } else {
               tail1.next = temp1;
               tail1 = temp1;
          }
          size1++;
     }

     void insertNode2(int val) {
          Node temp2 = new Node(val);
          if (head2 == null) {
               head2 = temp2;
               tail2 = temp2;
          } else {
               tail2.next = temp2;
               tail2 = temp2;
          }
          size2++;
     }

     void display1() {
          Node thNode = head1;
          while (thNode != null) {
               System.out.print(thNode.val + "=>");
               thNode = thNode.next;
          }
          System.out.println("null");
     }

     void display2() {
          Node tNode = head2;
          while (tNode != null) {
               System.out.print(tNode.val + "=>");
               tNode = tNode.next;
          }
          System.out.println("null");
     }

     Node mHead = null;
     Node mTail = null;
     int mSize = 0;

     void mergeAndPush() {
          Node mHead1 = head1;
          Node mHead2 = head2;

          if (mHead1 == null) {
               mHead = head2;
               return;
          }
          if (mHead2 == null) {
               mHead = head1;
               return;
          }

          // Step 1: initialize merged head
          if (mHead1.val < mHead2.val) {
               mHead = mHead1;
               mHead1 = mHead1.next;
               mSize++;
          } else {
               mHead = mHead2;
               mHead2 = mHead2.next;
               mSize++;
          }

          mTail = mHead;

          // Step 2: merge until one ends
          while (mHead1 != null && mHead2 != null) {
               if (mHead1.val < mHead2.val) {
                    mTail.next = mHead1;
                    mHead1 = mHead1.next;
                    mSize++;
               } else {
                    mTail.next = mHead2;
                    mHead2 = mHead2.next;
                    mSize++;
               }
               mTail = mTail.next;
          }

          // Step 3: append remaining nodes
          if (mHead1 != null)
               mTail.next = mHead1;
               mSize++;
          if (mHead2 != null)
               mTail.next = mHead2;
               mSize++;
     }

     void display3() {
          Node mTemp = mHead;
          // System.out.println(mTemp.val);

          while (mTemp != null) {
               System.out.print(mTemp.val + "=>");
               mTemp = mTemp.next;
          }
          System.out.println("null");
     }
}

public class MergeTwoSortedLL {
     public static void main(String[] args) {
          LinkedList ll = new LinkedList();
          ll.insertNode1(3);
          ll.insertNode1(5);
          ll.insertNode1(7);

          ll.display1();
          System.out.println("The size of ll -> " + ll.size1);
          ll.insertNode2(4);
          ll.insertNode2(6);
          ll.insertNode2(8);
          ll.insertNode2(9);

          ll.display2();
          System.out.println("The size of ll -> " + ll.size2);

          ll.mergeAndPush();
          ll.display3();
          System.out.println("The size of mLL => " + ll.mSize);
     }
}
