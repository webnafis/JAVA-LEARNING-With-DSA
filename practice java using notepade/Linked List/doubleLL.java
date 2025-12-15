import java.util.*;

class DoubleLL{
    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            next = null;
            prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            size = 1;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
        return;
    }
    
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            size = 1;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
        size++;
        return;
    }
    
    public void removeLast(){
        if(head==null){
            System.out.println("dbll is empty!!!");
            return;
        }
        if(head.next==null){
            head = tail = null;
            size = 0;
            return;
        }
        int sz = this.size;
        Node curr = head;
        while(sz> 2){
            curr= curr.next;
            sz--;
        }
        curr.next = null;
        size--;
        return;
    }
        
    public void removeFirst(){
        if(head==null){
            System.out.println("dbll is empty!!!");
            return;
        }
        if(head.next==null){
            head = tail = null;
            size = 0;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
        return;
    }

    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr!= null){
            next = curr.next;
            curr.prev= next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        tail = head;
        head = prev;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data);
            if(temp.next != null){
            System.out.print("<-->");
            }
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        DoubleLL dl = new DoubleLL();
        dl.addFirst(1);
        dl.addFirst(2);
        dl.addFirst(3);
        dl.print();

System.out.println(dl.size);
        dl.addLast(0);
        dl.print();

System.out.println(dl.size);
dl.reverse();
dl.print();
//         dl.removeLast();
//         dl.print();

// System.out.println(dl.size);
//         dl.removeFirst();
//         dl.print();

// System.out.println(dl.size);
    }
}