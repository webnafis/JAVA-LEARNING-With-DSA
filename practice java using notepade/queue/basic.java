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

    public static void main(String args[]){
        // QueueA q = new QueueA(10);
        // q.add(1);
        // q.add(2);
        // q.add(3);

        // while(!q.isEmpty()){
        //     System.out.print(q.peek());
        //     q.remove();
        // }

        QueueACircular q = new QueueACircular(10);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.print(q.peek());
            q.remove();
        }
    }
}