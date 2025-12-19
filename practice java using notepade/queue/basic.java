import java.util.*;

class Basic{
    static class QueueA{
        static int arr[];
        static int rear;
        static int size;
        QueueA(int n){
            arr = new int[n];
            rear = -1;
            size = n; 
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        public static void add(int data){
            if(rear+1 == size){
                System.out.println("queue is full!!!");
                return;
            }
            rear++;
            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("the queue is empty!!!");
                return Integer.MIN_VALUE;
            }

            int ret = arr[0];
            for(int i= 0; i< rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return ret;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("the queue is empty!!!");
                return Integer.MIN_VALUE;
            }
            return arr[0];
        }
    }

    static class QueueACircular{
        static int arr[];
        static int rear;
        static int size;
        static int front;
        QueueACircular(int n){
            arr = new int[n];
            rear = -1;
            size = n; 
            front = -1;
        }
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("queue is full!!!");
                return;
            }

            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("the queue is empty!!!");
                return Integer.MIN_VALUE;
            }

            int ret = arr[front];
            if(front == rear){
                // there is one element left
                front = rear = -1;
            }else{

            front = (front+1)%size;
            }

            return ret;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("the queue is empty!!!");
                return Integer.MIN_VALUE;
            }
            return arr[front];
        }
    }

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    static class Queue{
        static Node rear = null;
        static Node front = null;

        public static boolean isEmpty(){
            return rear == null && front == null;
        }

        public static void add(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                front = rear = newNode;
                return;
            }

            rear.next = newNode;
            rear = newNode;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("the queue is empty!!!");
                return Integer.MIN_VALUE;
            }

            int ret = front.data;
            if(front == rear){
                // there is one element left
                front = rear = null;
            }else{

            front = front.next;
            }

            return ret;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("the queue is empty!!!");
                return Integer.MIN_VALUE;
            }
            return front.data;
        }
    }

    static class QueueS{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("the queue is empty!!!");
                return Integer.MIN_VALUE;
            }

            return s1.pop();
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("the queue is empty!!!");
                return Integer.MIN_VALUE;
            }
            return s1.peek();
        }
    }

    static class QueueD{
        static Deque<Integer> d = new LinkedList<>();

        public static boolean isEmpty(){
            return d.isEmpty();
        }

        public static void add(int data){
            d.addLast(data);
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("the queue is empty!!!");
                return Integer.MIN_VALUE;
            }

            return d.removeFirst();
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("the queue is empty!!!");
                return Integer.MIN_VALUE;
            }
            return d.getFirst();
        }

    }

    public static void main(String args[]){
        // QueueA q = new QueueA(10);
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // while(!q.isEmpty()){
        //     System.out.print(q.peek());
        //     q.remove();
        // }
        // QueueACircular q = new QueueACircular(10);
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // while(!q.isEmpty()){
        //     System.out.print(q.peek());
        //     q.remove();
        // }
        // Queue q = new Queue();
        // q.add(1);
        // q.add(2);
        // q.add(3);

        // while(!q.isEmpty()){
        //     System.out.print(q.peek());
        //     q.remove();
        // }
        // QueueS q = new QueueS();
        // q.add(1);
        // q.add(2);
        // q.add(3);

        // while(!q.isEmpty()){
        //     System.out.print(q.peek());
        //     q.remove();
        // }

        // Deque<Integer> dq = new LinkedList<>();
        // dq.addFirst(1);
        // dq.addLast(2);
        // dq.addFirst(3);
        // System.out.println(dq);
        // dq.removeFirst();
        // dq.removeLast();
        // System.out.println(dq);
        // dq.addFirst(222);
        // System.out.println(dq.getFirst());
        // System.out.println(dq.getLast());

        QueueD q = new QueueD();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.print(q.peek());
            q.remove();
        }
    }
}