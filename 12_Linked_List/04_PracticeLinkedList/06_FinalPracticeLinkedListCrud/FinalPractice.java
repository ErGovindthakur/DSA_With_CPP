class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

// Linked list class to do all the possible operation over linkedlist

class LinkedList{
    // initially keeping head and tail null , since we don't have any node in ll
    Node head = null;
    Node tail = null;
    int size = 0;
    
    // 1. Inserting Node at end of ll
    void insertAtEnd(int data){
        // check points
        Node temp = new Node(data);
        if(head == null){
            head = temp;
            tail = temp;
        }else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    // 2. diplaying all nodes in ll
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"=>");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    // 3. Inserting Nodes at beginning of ll
    void insertAtBeginning(int data){
        Node temp = new Node(data);
        
        temp.next = head;
        head = temp;
        size++;
    }
    
    // 4. insert Node at any index
    void insertAtAnyIndex(int idx, int data){
        Node temp = new Node(data);
        // check points
        if(idx < 0 || idx > size){
            System.out.println("Plz enter valid index number");
            return;
        }
        
        if(idx==0){
            if(head==null){
                head = temp;
                tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }
            size++;
            return;
        }
        
        if(idx==size){
            // 1. if tail is given (1st one)
            // tail.next = temp;
            // tail = temp;
            // size++;
            // return;
            
            // 2. lset suppose you don't know tail (2nd one)
            Node tHead = head;
            while(tHead.next!=null){
                tHead = tHead.next;
            }
            tHead.next = temp;
            tail = temp;
            size++;
            return;
        }
        
        // now actual work
        Node tHead = head;
        for(int i = 0; i<idx-1; i++){
            tHead = tHead.next;
        }
        temp.next = tHead.next;
        tHead.next = temp;
        
        size++;
    }
    
    
    // 5. Now Deletion 
    void deleteNode(int idx){
        // check points
        if(idx<0 || idx>size){
            System.out.println("Plz enter a valid index in deleteNode method");
            return;
        }
        
        if(idx==0){
            if(head==null){
                System.out.println("Don't have Node in ll to delete");
                return;
            }
            
            head = head.next;
            size--;
            return;
        }
        
        if(idx==size){
            // if tail is known
            Node tHead = head;
            while(tHead.next!=null){
                tHead = tHead.next;
            }
            tHead.next = null;
            tail = tHead;
            size--;
            return;
        }
        
        // now actual work
        Node tHead = head;
        for(int i = 0; i<idx-1; i++){
            tHead = tHead.next;
        }
        tHead.next = tHead.next.next;
        size--;
    }
    
    // 6. get Node at index
    int getNodeAt(int idx){
        // check points
        if(idx<0 || idx>=size){
            System.out.println("Plz enter a valid idx value");
            return -1;
        }
        
        Node tHead = head;
        for(int i = 0; i<idx; i++){
            tHead = tHead.next;
        }
        return tHead.data;
    }
}

class FinalPractice {
    public static void main(String[] args) {
        System.out.println("Linked-List Revision");
        // creating the instance of ll class so that , could perform operations
        LinkedList ll = new LinkedList();
        
        // adding nodes into ll
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        
        ll.insertAtBeginning(0);
        ll.insertAtAnyIndex(0,-1);
        ll.insertAtAnyIndex(ll.size,4);
        ll.insertAtAnyIndex(3,4);
        ll.deleteNode(0);
        ll.deleteNode(ll.size-1);
        ll.deleteNode(2);
        
        int dataAtIdx = ll.getNodeAt(4);
        System.out.println("Data at index 4 is "+dataAtIdx);
        // displaying all the nodes of ll
        ll.display();
        
        // displaying total size of ll
        System.out.println("Total size of ll -> "+ll.size);
        
    }
}
