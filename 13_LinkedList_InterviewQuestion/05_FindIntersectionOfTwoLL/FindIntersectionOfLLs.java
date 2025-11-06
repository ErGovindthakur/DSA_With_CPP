class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }

public class FindIntersectionOfLLs {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) return null;
        int sizeA = 0;
        int sizeB = 0;

        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while(temp1 != null){
            sizeA++;
            temp1 = temp1.next;
        }
        while(temp2 != null){
            sizeB++;
            temp2 = temp2.next;
        }

        ListNode tempA = headA;
        ListNode tempB = headB;
        if(sizeA>=sizeB){
            for(int i = 0; i<(sizeA-sizeB); i++){
                tempA = tempA.next;
            }
        }else{
            for(int i = 0; i<(sizeB-sizeA); i++){
                tempB = tempB.next;
            }
        }

        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return tempA;
    }
}
