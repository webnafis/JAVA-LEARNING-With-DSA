import java.util.*;

class JcfLL{

    public static void practiceJCL(){
        LinkedList<Integer> list1 = new LinkedList<>();
        List<Integer> existingList = Arrays.asList(1, 2, 3, 4);
        LinkedList<Integer> list2 = new LinkedList<>(existingList);
        LinkedList<Integer> list3 = new LinkedList<>(Arrays.asList(5,6, 9,7,8, 9));
        boolean added = list1.add(1);
        list1.addLast(2);
        list1.addFirst(0);
        list1.add(1, 100);
        System.out.println(list1);
        list1.addAll(Arrays.asList(3,4,5,6,7));
        System.out.println(list1);
        list1.addAll(1, Arrays.asList(200, 300, 400));
        System.out.println(list1);
        System.out.println(list1.get(1));
        System.out.println(list1.getFirst());
        System.out.println(list1.getLast());
        System.out.println(list1.peek());//first element
        System.out.println(list1.peekFirst());
        System.out.println(list1.peekLast());
        System.out.println(list1);
        int rem = list1.remove(1);
        boolean rem1 = list1.remove("c");
        int remf = list1.removeFirst();
        int reml = list1.removeLast();

        int head = list1.poll();
        int head2 = list1.pollFirst();
        int tail = list1.pollLast();
        System.out.println(""+rem+ rem1+ remf+ reml+ head+ head2+ tail);
        list1.clear();
        System.out.println(list1);
        boolean has9 = list3.contains(9);
        int index = list3.indexOf(9);
        int lastIndex = list3.lastIndexOf(9);
        boolean isEmpty = list3.isEmpty();
        int size = list3.size();
        System.out.println(""+ has9+ index + lastIndex + isEmpty + size);
        System.out.println(list3);
        int old = list3.set(0, 1000);
        System.out.println("" +list3 +  old);

    }
    public static void main(String args[]){
        // LinkedList<Integer> ll = new LinkedList<>();

        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(3);
        // ll.addFirst(0);

        // System.out.println(ll);
        // ll.removeFirst();
        // ll.removeLast();
        // System.out.println(ll.Head);
        // practiceJCL();


    }
}