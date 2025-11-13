
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LLCycleStartNode {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                ListNode temp = head;

                while (temp != slow) {
                    temp = temp.next;
                    slow = slow.next;

                }
                return slow;
            }
        }
        return null;
    }
}