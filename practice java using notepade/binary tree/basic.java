// O(n) tc of build tree
import java.util.*;

class Basic{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Tree{
        static int idx = -1;
        public static Node buildTree(int[] arr){
            idx++;
            if(arr[idx] == -1){
                return null;
            }
            Node newNode = new Node(arr[idx]);
            newNode.left = buildTree(arr);
            newNode.right = buildTree(arr);

            return newNode;
        }       

        public static void preorder(Node root){//O(n)
            if(root == null){
                // System.out.print(-1+ " ");
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        } 

        public static void inorder(Node root){//O(n)
            if(root == null){
                // System.out.print(-1+ " ");
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        public static void postorder(Node root){//O(n)
            if(root == null){
                // System.out.print(-1+ " ");
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        } 
        
        public static void levelorder(Node root){
            if(root == null){
                return;
            }
            // Queue<Node> q = new ArrayDeque<>();// cant use cause i shouldnt use here or add here null
            
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            Node curr;
            while(!q.isEmpty()){
                curr = q.remove();
                if(curr == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                    q.add(null);
                    }
                }else{
                System.out.print(curr.data+" ");
                if(curr.left != null){

                q.add(curr.left);
                }
                if(curr.right != null){

                q.add(curr.right);
                }
                }
            }
        }

    }

    // calculating height by nodes, if want to calculate by edges then minus 1 from the ultimate result of height by nodes
    public static int heightOfTree(Node root){//O(n)
        if(root == null){
            return 0;
        }
        return Math.max(heightOfTree(root.left), heightOfTree(root.right)) + 1;
    }

    public static int countOfNodes(Node root){//O(n)
        if(root == null){
            return 0;
        }
        return countOfNodes(root.left) + countOfNodes(root.right) + 1;
    }

    public static int sumOfNodes(Node root){//O(n)
        if(root == null){
            return 0;
        }
        return sumOfNodes(root.left) + sumOfNodes(root.right) + root.data;
    }

    static class Info{
        int diam;
        int height;
        Info(int diam, int height){
            this.diam = diam;
            this.height = height;
        }
    }

    public static Info diameter(Node root){
        if(root == null){
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        return new Info(Math.max(Math.max(leftInfo.diam, rightInfo.diam), (leftInfo.height + rightInfo.height + 1)), (Math.max(leftInfo.height, rightInfo.height)+1));
    }

    public static boolean isIdentical(Node root, Node subroot){
        if(root == null || subroot == null){
            return root == subroot;
        }
        if( root.data != subroot.data){
            return false;
        }

        return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);

    }

    public static boolean subtreeOfAnotherTree(Node root, Node subroot){
        if(subroot == null){
            return true;
        }
        if(root == null ){
            return false;
        } 
        if(root.data == subroot.data && isIdentical(root, subroot)){
            return true;
        }

        return subtreeOfAnotherTree(root.left, subroot) ||  subtreeOfAnotherTree(root.right, subroot);

    }
    static class TopVInfo{
        Node node;
        int hd;
        TopVInfo(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    // top view and bottom view
    public static void topView(Node root){
        Queue<TopVInfo>  q = new LinkedList<>();
        HashMap<Integer, Node> tops = new HashMap<>();

        q.add(new TopVInfo(root, 0));
        q.add(null);
        int min = 0;
        int max = 0;
        while(!q.isEmpty()){
            TopVInfo curr = q.remove();
            if(curr == null){
                if(!q.isEmpty()){
                    q.add(null);
                }
            }else{
                if(curr.node.left != null){
                    q.add(new TopVInfo(curr.node.left, curr.hd -1));
                    min = Math.min(min, curr.hd -1);
                }
                if(curr.node.right != null){
                    q.add(new TopVInfo(curr.node.right, curr.hd +1));
                    max = Math.max(max, curr.hd +1);
                }

                if(!tops.containsKey(curr.hd)){
                    tops.put(curr.hd, curr.node);
                }

            }
        }

        for(int i = min; i<= max; i++){
            System.out.print(tops.get(i).data + " ");
        }
        System.out.println();

    }

    public static void bottomView(Node root){
        Queue<TopVInfo>  q = new LinkedList<>();
        HashMap<Integer, Node> bottoms = new HashMap<>();

        q.add(new TopVInfo(root, 0));
        q.add(null);
        int min = 0;
        int max = 0;
        while(!q.isEmpty()){
            TopVInfo curr = q.remove();
            if(curr == null){
                if(!q.isEmpty()){
                    q.add(null);
                }
            }else{
                if(curr.node.left != null){
                    q.add(new TopVInfo(curr.node.left, curr.hd -1));
                    min = Math.min(min, curr.hd -1);
                }
                if(curr.node.right != null){
                    q.add(new TopVInfo(curr.node.right, curr.hd +1));
                    max = Math.max(max, curr.hd +1);
                }

                bottoms.put(curr.hd, curr.node);

            }
        }

        for(int i = min; i<= max; i++){
            System.out.print(bottoms.get(i).data + " ");
        }
        System.out.println();
    }

    public static void kthLevel(Node root, int level, int K){// O(n)
        // one way is level order approach but i am gonna use recursion to learn
        //https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/description/
        // upper approach needs iterative i think...
        if(root == null){
            return;
        }
        if(K == level){
            System.out.print(root.data + " ");
            return;
        }
        kthLevel(root.left, level+1, K);
        kthLevel(root.right, level+1, K);

    }

    public static Node lowestCommonAncestorApproach2(Node root, int n1, int n2){//O(n) but space recursion stack which is also O(n)
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node left = lowestCommonAncestorApproach2(root.left, n1, n2);
        Node right = lowestCommonAncestorApproach2(root.right, n1, n2);
        if(right == null){
            return left;
        }
        if(left == null){
            return right;
        }
        return root;
    }

    public static boolean getancestors(ArrayList<Node> arr, Node root, int n){
        if(root == null){
            return false;
        }
        arr.add(root);
        if(root.data == n){
            return true;
        }
        if(getancestors(arr, root.left, n) || getancestors(arr, root.right, n)){
            return true;
        }

        arr.remove(arr.size() - 1);
        return false;

    }

    public static Node lowestCommonAncestorApproach1(Node root, int n1, int n2){//O(n) but space 2 al
        if(root == null){
            return null;
        }
        ArrayList<Node> arr1 = new ArrayList<>();
        ArrayList<Node> arr2 = new ArrayList<>();

        getancestors(arr1, root, n1);
        getancestors(arr2, root, n2);
        int i = 0;
        for(; i< arr1.size() && i< arr2.size(); i++){
            if(arr1.get(i) != arr2.get(i)){
                break;
            }
        }

        return arr1.get(i-1);
    }

    public static int minDistanceBetween2NodesByNafisUnchecked(){

    }

    // edit in lca to find min distance and submit and check which one is better.  chatgpt leetcode

    public static void main(String[] args){
        // int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        // Tree tree = new Tree();
        // Node root = tree.buildTree(arr);
        // System.out.println(root.data);
        // tree.levelorder(root);

        /*
                    1
                   / \
                  2   3
                 / \ / \
                4  5 6  7
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


       /*
              2 
             / \ 
            4   5 
        */
        Node sRoot = new Node(2);
        sRoot.left = new Node(4);
        sRoot.right = new Node(5);

        // System.out.println(heightOfTree(root));
        // System.out.println(diameter(root).height); 
        // System.out.println(subtreeOfAnotherTree(root, sRoot));
        // topView(root);
        // bottomView(root);
        // kthLevel(root, 1, 1);
        System.out.println(lowestCommonAncestorApproach1(root, 4, 6).data);


    }
}