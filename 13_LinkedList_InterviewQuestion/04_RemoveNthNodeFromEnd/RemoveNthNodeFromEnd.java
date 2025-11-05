class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head = null;
    Node tail = null;
    int size = 0;

    void insertNode(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void removeNthNodeFromLast(int nIdx) {
        if (head == null) return;

        Node fast = head;
        Node slow = head;

        // move fast nIdx steps ahead
        for (int i = 0; i < nIdx; i++) {
            fast = fast.next;
        }

        // if fast becomes null -> remove head
        if (fast == null) {
            head = head.next;
            size--;
            return;
        }

        // move both until fast.next reaches null
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // delete node
        slow.next = slow.next.next;
        size--;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "=>");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class RemoveNthNodeFromEnd {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertNode(10);
        ll.insertNode(20);
        ll.insertNode(30);
        ll.insertNode(40);
        ll.insertNode(50);

        ll.removeNthNodeFromLast(3);
        ll.display();
    }
}
