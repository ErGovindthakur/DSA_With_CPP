class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListAllMethod {
    Node head = null;
    Node tail = null;
    int size = 0;

    // 1. Insert at end
    void insertAtEnd(int data) {
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

    // 2. Display
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // 3. Insert at beginning
    void insertAtBeginning(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
        if (tail == null) tail = temp;
        size++;
    }

    // 4. Insert at any index
    void insertAtAnyIndex(int idx, int data) {
        if (idx < 0 || idx > size) {
            System.out.println("Please enter a valid index!");
            return;
        }

        if (idx == 0) {
            insertAtBeginning(data);
            return;
        }

        if (idx == size) {
            insertAtEnd(data);
            return;
        }

        Node temp = new Node(data);
        Node tHead = head;
        for (int i = 0; i < idx - 1; i++) {
            tHead = tHead.next;
        }
        temp.next = tHead.next;
        tHead.next = temp;
        size++;
    }

    // 5. Delete node at index
    void deleteNode(int idx) {
        if (idx < 0 || idx >= size) {
            System.out.println("Please enter a valid index!");
            return;
        }

        if (idx == 0) {
            head = head.next;
            size--;
            if (size == 0) tail = null;
            return;
        }

        Node tHead = head;
        for (int i = 0; i < idx - 1; i++) {
            tHead = tHead.next;
        }

        tHead.next = tHead.next.next;
        if (idx == size - 1) tail = tHead;
        size--;
    }

    // 6. Get node data
    int getNode(int idx) {
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid index!");
            return -1;
        }
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
}

public class CombineAllBasicOfLinkedList {
    public static void main(String[] args) {
        LinkedListAllMethod ll = new LinkedListAllMethod();

        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);
        ll.insertAtBeginning(9);
        ll.insertAtAnyIndex(2, 11);
        ll.deleteNode(1);

        ll.display();
        System.out.println("Node data at idx 1 => " + ll.getNode(1));
        System.out.println("Total length of ll => " + ll.size);
    }
}
