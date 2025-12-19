import java.util.*;

class Basic{
    public static class Node{
        int data;
        Node prev;
        Node(int data){
            this.data = data;
            this.prev = null;
        }
    }
    public static class Stackll{
        static Node top=null;
        public static boolean isEmpty(){
            return top == null;
        }
        public static void push(int data){
            if(isEmpty()){
                top = new Node(data);
                return;
            }
            
                Node newNode = new Node(data);
                newNode.prev = top;
                top = newNode;
                return;
            
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return top.data;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int val = top.data;
            top = top.prev;
            return val;
        }
    }

    static class StackAL{
        static ArrayList<Integer> al = new ArrayList<>();
        public static boolean isEmpty(){
            return al.size()==0;
        }
        public static void push(int data){
            al.add(data);
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int ret = al.get(al.size()-1);
            al.remove(al.size()-1);
            return ret;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return al.get(al.size()-1);
        }
    }

    static class StackQ{
        static Queue<Integer> q1 = new ArrayDeque<>();
        static Queue<Integer> q2 = new ArrayDeque<>();

        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data){
            if(q1.isEmpty()){
                q1.add(data);
                while(!q2.isEmpty()){
                    q1.add(q2.remove());
                }
            }else{
                q2.add(data);
                while(!q1.isEmpty()){
                    q2.add(q1.remove());
                }
            }
            
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("empty stack");
                return -1;
            }
            return q1.isEmpty()? q2.peek(): q1.peek();
        }

        public static int pop(){
            if(isEmpty()){
                System.out.println("empty stack");
                return -1;
            }
            return q1.isEmpty()? q2.remove(): q1.remove();
        }

    }

    static class StackD{
        static Deque<Integer> d = new LinkedList<>();

        public static boolean isEmpty(){
            return d.isEmpty();
        }

        public static void push(int data){
            d.addFirst(data);
            
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("empty stack");
                return -1;
            }
            return d.getFirst();
        }

        public static int pop(){
            if(isEmpty()){
                System.out.println("empty stack");
                return -1;
            }
            return d.removeFirst();
        }

    }

    public static void main(String[] args){
        // Stackll stack= new Stackll();
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);
        // while(!stack.isEmpty()){
        // System.out.println(stack.peek());
        // stack.pop();
        // }
        // System.out.println("salam......");
        // Stack<Integer> stack= new Stack<>();
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);
        // while(!stack.isEmpty()){
        // System.out.println(stack.peek());
        // stack.pop();
        // }
        // System.out.println("salam......");

        // StackQ stack= new StackQ();
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);
        // while(!stack.isEmpty()){
        // System.out.println(stack.peek());
        // stack.pop();
        // }
        // System.out.println("salam......");

        StackD stack= new StackD();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while(!stack.isEmpty()){
        System.out.println(stack.peek());
        stack.pop();
        }
        System.out.println("salam......");

    }
}