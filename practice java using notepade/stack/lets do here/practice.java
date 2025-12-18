import java.util.*;

class Practice{

    public static void pushAtTheBottomOfStack(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int val = s.pop();
        pushAtTheBottomOfStack(s, data);
        s.push(val);
    }

    public static void printStack(Stack<Integer> stack){

        while(!stack.isEmpty()){
        System.out.println(stack.pop());
        }
    }

    public static String reverseAString(String s){
        Stack<Character> temp = new Stack<>();
        for(int i = 0; i< s.length(); i++){
            temp.push(s.charAt(i));
        }
        StringBuilder ret = new StringBuilder("");
        while(!temp.isEmpty()){
            ret.append(temp.pop());
        }
        return ret.toString();
    }

    public static void reverseAStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int val = s.pop();
        reverseAStack(s);
        pushAtTheBottomOfStack(s, val);
    }

    public static void stockSpanProblem(int[] stocks, int[] spans){
        Stack<Integer> ind = new Stack<>();
        for(int i = 0; i< stocks.length; i++){
            while(!ind.isEmpty() && stocks[i]>=stocks[ind.peek()]){
                ind.pop();
            }
            if(ind.isEmpty()){
                spans[i] = (i+1);
            }else{
                spans[i] = (i-ind.peek());
            }
                ind.push(i);
        }
        
    }

    public static void nextGreaterElementFinding(int[] el, int[] nextGreaterEl){//O(n)
        Stack<Integer> nextGreaters = new Stack<>();
        // to get next getter left change the conditions in loop and variables values like:
        // for(int i = 0; i<el.length; i++){
        // currently its in next greater right
        for(int i = el.length-1; i>-1; i--){
        // to get next smaller right or left again when next SMALLER than change this loop conditon like:
        // while(!nextGreaters.isEmpty() && el[i]<=el[nextGreaters.peek()]){
        // currently next greater it is 
            while(!nextGreaters.isEmpty() && el[i]>=el[nextGreaters.peek()]){
                nextGreaters.pop();
            }
            if(nextGreaters.isEmpty()){
                nextGreaterEl[i] = -1;
            }else{
                nextGreaterEl[i] =  el[nextGreaters.peek()];
            }
            nextGreaters.push(i);
        }
    }

    public static boolean validParentheses(String s){//O(n)
        Stack<Character> cont = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char temp = s.charAt(i);
            if( temp == '(' || temp == '['  || temp == '{'){
                cont.push(temp);
            }else{
                if(cont.isEmpty()){
                    return false;
                }else if((temp == ')' && cont.peek() == '(') || (temp == ']' && cont.peek() == '[') || (temp == '}' && cont.peek() == '{')){
                    cont.pop();
                }else{
                    return false;
                }
            }
        }
        return cont.isEmpty();
    }
        
    public static boolean hasDuplicateParentheses(String s){//O(n)
        // let the test cases will have valid parentheses
        Stack<Character> cont = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char temp = s.charAt(i);
            if(temp == ')'){
                int count =0;
                while( cont.peek() != '('){
                    cont.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }else{
                    cont.pop();
                }
            }else{
                cont.push(temp);
            }
            
        }
        return false;
    }

    public static int maxRectangleAreaInHistogram(int[] heights) {
        Stack<Integer> smaller = new Stack<>();
        // Stack<Integer> nextSmaller = new Stack<>();
        int[] prevsmall = new int[heights.length];

        for(int i = 0; i< heights.length; i++){
            while(!smaller.isEmpty() && heights[i] <= heights[smaller.peek()]){
                smaller.pop();
            }
            if(smaller.isEmpty()){
                prevsmall[i] = -1;
            }else{

            prevsmall[i] = smaller.peek();
            }
            smaller.push(i);

        }
        // smaller.clear();
        smaller = new Stack<>();

        // i  dont want to calculate and store this for all el of heights so:
        int maxArea = 0;
        for(int i = heights.length-1; i>-1; i--){
            while(!smaller.isEmpty() && heights[i] <= heights[smaller.peek()]){
                smaller.pop();
            }
            // int nextsmall = nextSmaller.isEmpty()? heights.length: nextSmaller.peek();
            // int width = (nextSmaller.isEmpty()? heights.length: nextSmaller.peek()) - prevsmall[i]-1;
            int area = heights[i] * ((smaller.isEmpty()? heights.length: smaller.peek()) - prevsmall[i]-1);
            maxArea = Math.max( area, maxArea);
            smaller.push(i);
        }

        return maxArea;
        
    }

    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        // while(!stack.isEmpty()){
        // System.out.println(stack.peek());
        // stack.pop();
        // }
        // System.out.println("salam......");
        // printStack(stack);
        // pushAtTheBottomOfStack(stack, 0);
        // reverseAStack(stack);
        // printStack(stack);
        // System.out.println(reverseAString("nsa"));

        // int stocks[] = {100, 80, 60, 70, 60, 85, 100 };
        // int spans[] = new int[stocks.length];
        // stockSpanProblem(stocks, spans);
        // for(int i = 0; i< spans.length; i++){

        // System.out.println(spans[i]);
        // }

        // int arr[] = {6, 8, 0, 1, 3 };
        // int nextGreaterEl[] = new int[arr.length];
        // nextGreaterElementFinding(arr, nextGreaterEl);
        // for(int i = 0; i< nextGreaterEl.length; i++){
        // System.out.println(nextGreaterEl[i]);
        // }

        // System.out.println(validParentheses("({})[]"));
        // System.out.println(validParentheses("(({})[]"));
        // System.out.println(validParentheses("(]"));
        // System.out.println(validParentheses(")("));
        // System.out.println(validParentheses("{{()}[]}"));
        // System.out.println(hasDuplicateParentheses("((a+b))"));
        // System.out.println(hasDuplicateParentheses("(a-b)"));
        int arr[] = {2, 4};
        System.out.println(maxRectangleAreaInHistogram(arr));




    }
}