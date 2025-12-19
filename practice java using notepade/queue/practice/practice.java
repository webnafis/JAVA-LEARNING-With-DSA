import java.util.*;

class practice{

    public static void firstNonRempeatingLetters(String s){
        int letters[] = new int[26];
        Queue<Character> firstLs = new ArrayDeque<>();
        for(int i = 0; i< s.length(); i++){
            char curr = s.charAt(i);
            letters[curr-'a']++;
            firstLs.add(curr);
            while(!firstLs.isEmpty() && letters[firstLs.peek()-'a']>1 ){
                firstLs.remove();
            }
            if(firstLs.isEmpty()){
                System.out.print(-1 + " ");
            }else{
                System.out.print(firstLs.peek() + " ");
            }
        }
    }

    public static void interleave2HalvesOfAQueue(Queue<Integer> q){
        Queue<Integer> temp = new ArrayDeque<>();
        int size = q.size()/2;
        for(int i= 0; i< size; i++){
            temp.add(q.remove());
        }
        // for(int i= 0; i< size; i++){
        //     q.add(temp.remove());
        //     q.add(q.remove());
        // }
        while(!temp.isEmpty()){
            q.add(temp.remove());
            q.add(q.remove());
        }

    }

    public static void queueReverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }

    public static void main(String args[]){
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interleave2HalvesOfAQueue(q);
        queueReverse(q);



        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
            // System.out.println(q.size());


        // firstNonRempeatingLetters("aabccxb");
    }
}