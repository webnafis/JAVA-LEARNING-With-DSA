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
        Stack<Integer> stack= new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        // while(!stack.isEmpty()){
        // System.out.println(stack.peek());
        // stack.pop();
        // }
        // System.out.println("salam......");

    }
}