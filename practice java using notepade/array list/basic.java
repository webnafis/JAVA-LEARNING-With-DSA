import java.util.*;


class Basic{

     public static void swap(ArrayList<Integer> list, int i1, int i2){
        int temp = list.get(i1);
        list.set(i1, list.get(i2));
        list.set(i2, temp);
     }

    public static void main(String args[]){
        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();
        // list.add(1);
        // list.add(6);
        // list.add(0);
        // list.add(4);

        // System.out.println(list);
        // int el = list.get(2);
        // System.out.println(el);
        // list.remove(3);
        // System.out.println(list);
        // list.set(1, 100);
        // System.out.println(list.contains(40));
    //     list.add(1, 200);
    //     System.out.println(list.size());

    // for(int i = 0; i< list.size(); i++){
    //     System.out.print(list.get(i)+ " ");
    // }
    // System.out.println();
    // for(int i = list.size()-1; i>= 0; i--){
    //     System.out.print(list.get(i)+ " ");
    // }
    // System.out.println();
    // int max = Integer.MIN_VALUE;
    // for(int i = list.size()-1; i>= 0; i--){
    //     // if(max< list.get(i)){
    //     //     max = list.get(i);
    //     // }
    //     max = Math.max(max, list.get(i));
    // }
    // System.out.println(max);
    // swap(list,0,1);
    // Collections.sort(list);
    // System.out.println(list);
    // Collections.sort(list, Collections.reverseOrder());
    // System.out.println(list);

//     ArrayList<ArrayList<Integer>> tdList = new ArrayList<>();
//     ArrayList<Integer> list1 = new ArrayList<>();
//     list1.add(1); 
//     list1.add(2);
//     list1.add(2);
//     tdList.add(list1); 
//     ArrayList<Integer> list2 = new ArrayList<>();
//     list2.add(3); 
//     list2.add(4);
//     tdList.add(list2);
//     for(int i =0 ; i< tdList.size(); i++){
//         ArrayList<Integer> currList = tdList.get(i);
//         for(int j= 0 ; j< currList.size(); j++){
//             System.out.print(currList.get(j));
//         }
//         System.out.println();
//     } 
// System.out.println(tdList);


    ArrayList<ArrayList<Integer>> tdList = new ArrayList<>();
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    ArrayList<Integer> list3 = new ArrayList<>();

    for(int i =1 ; i< 5; i++){
        list1.add(i*1);
        list2.add(i*2);
        list3.add(i*3);
    } 
list2.remove(1);
list2.remove(1);
    tdList.add(list1);
    tdList.add(list2);
    tdList.add(list3);

System.out.println(tdList);
    for(int i =0 ; i< tdList.size(); i++){
        ArrayList<Integer> currList = tdList.get(i);
        for(int j= 0 ; j< currList.size(); j++){
            System.out.print(currList.get(j));
        }
        System.out.println();
    } 
    }
}