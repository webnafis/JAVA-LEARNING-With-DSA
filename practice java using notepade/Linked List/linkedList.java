import java.util.*;

class LinkedList{

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this. next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add, remove, print search -- methods
    public void addFirst(int data){
        this.size++;
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = this.tail = newNode;
            return;
        }
        newNode.next = this.head;
        this.head = newNode;
    }

    public void addLast(int data){
        this.size++;
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = this.tail = newNode;
            return;
        }
        this.tail.next = newNode;
        this.tail = newNode;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty.");
            return Integer.MIN_VALUE;
        }else if (size == 1){
        int d = this.head.data;
            this.head = this.tail = null;
            this.size = 0;
            return d;
        }
        int d = this.head.data;
        this.head = this.head.next;
        this.size--;
        return d;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty.");
            return Integer.MIN_VALUE;
        }else if (size == 1){
        int d = this.head.data;
            this.head = this.tail = null;
            this.size = 0;
            return d;
        }
        Node temp = head;
        for(int i = 0; i< size-2; i++){
            temp = temp.next;
        }
        int d = temp.next.data;
        temp.next = null;
        tail = temp;
        this.size--;
        return d;
    }

    public void add(int i, int data){
        if(i ==0){
            addFirst(data);
            return;
        }
        this.size++;
        Node temp = this.head;
        for(int j= 0; j< i-1; j++){
            temp = temp.next;
        }
        Node newNode = new Node (data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int itrSearch(int key){ //O(n)
        if(head == null){
            return -1;
        }
        Node temp = head;
        for(int i = 0 ; temp != null; i++){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next ;
        while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;   
        }
        head = prev;
    }

    public void findRemoveNthNodefromEnd(int n){
        if(size-n == 0 ) {
            head = head.next;
            return;
        }
        Node temp = head; // temp is previous node
        for(int i= 1; i< size-n; i++){ //for better understanding
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return;
    }

    public int recSearch(int key){
        return helper(head, key);
    }

    public int helper(Node thead, int key){ //O(n)
        if(thead == null){
            return -1;
        }
        if(thead.data == key){
            return 0;
        }
        int i = helper(thead.next, key);
        if(i!= -1){
            return i+1;
        }else{
            return i;
        }
    }

    public void printLL(){ //O(n)
        if(this.head == null){
            System.out.println("LL is empty!");
            return;
        }
        Node temp = this.head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }

        Node temp = findMid(head);

        Node curr = temp.next;
        temp.next = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = temp;
            temp = curr;
            curr = next;
        }
        Node h = head;
        while(temp != null){
            if(h.data != temp.data){
                return false;
            }
            h = h.next;
            temp = temp.next;
        }
        return true;
    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        Node slow = head;
        Node fast = head;
        boolean cycle= false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(!cycle){
            return ;
        }
        slow = head;
        Node prev = null;
        while(fast != slow){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }

    public Node mergeSort(Node head){
        // first complete linkedlist jcf from deepseek
        if(head.next == null){
            return head;
        }
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node head2 = slow.next;
        slow.next = null;
        return merge(mergeSort(head), mergeSort(head2));
    }
    public Node merge(Node head, Node head2){
        Node newNode = new Node(0);
        Node temp = newNode;
        while(head != null && head2 != null){
            if(head.data > head2.data){
                temp.next = head2;
                temp = temp.next;
                head2 = head2.next;
            }else{
                temp.next = head;
                temp = temp.next;
                head = head.next;
            }
        }
        while(head != null ){
            
            temp.next = head;
            temp = temp.next;
            head = head.next;
            
        }
        while( head2 != null){
            temp.next = head2;
            temp = temp.next;
            head2 = head2.next;
            
        }
        return newNode.next;
    }

    public void zigzag(Node head){
        Node mid = findMid(head);
        Node head2 = reverseForAny(mid.next);
        mid.next = null;
        Node temp = null;
        while(head != null && head2 != null){
            temp = head.next;
            head.next = head2;
            head2 = head2.next;
            head.next.next = temp;
            head = head.next.next;
        }

    }
        public Node reverseForAny(Node head){
        Node prev = null;
        Node curr = head;
        Node next ;
        while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;   
        }
        return prev;
    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        // ll.printLL();
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(2);
        // ll.printLL();
        // ll.add(2, 100);
        // ll.printLL();
        // ll.removeLast();
        // ll.printLL();
        // ll.removeFirst();
        // ll.reverse();
        // ll.printLL();
        // ll.findRemoveNthNodefromEnd(3);
        // ll.printLL();
        // System.out.println(size);
        // System.out.println(ll.recSearch(100));
        // System.out.println(ll.recSearch(1000));
        // System.out.println(ll.checkPalindrome());
        head = new Node(10);
        head.next = new Node(9);
        head.next.next = new Node(8);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(6);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = head.next;
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
        ll.printLL();
        ll.head = ll.mergeSort(ll.head); // must do after merge sort
        ll.printLL();
        ll.zigzag(ll.head);
        ll.printLL();
    }
}