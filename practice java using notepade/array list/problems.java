import java.util.*;


class Problems{

public static int storeWater(ArrayList<Integer> h){
    int a = 0;
        for(int i = 0 ; i<h.size(); i++){
            for(int j= i+1; j< h.size(); j++){
                a = Math.max(a, ((j-i)*Math.min(h.get(i), h.get(j))));
                
            }
        }
        return a;
}

public static int storeWater2pointerApproach(ArrayList<Integer> h){
    int si = 0;
    int ei = h.size()-1;
    int a = 0;
    while(si<ei){

        a = Math.max(a, ((ei-si)*Math.min(h.get(ei), h.get(si))));
        if(h.get(si)> h.get(ei)){
            ei--;
        }else{
            si++;
        }
    }
    return a;
}

public static boolean pairSum1(ArrayList<Integer> h , int tar){
        for(int i = 0 ; i<h.size(); i++){
            for(int j= i+1; j< h.size(); j++){
                if(h.get(i)+h.get(j)== tar)return true;
            }
        }
        return false;
}

public static boolean pairSum2pointerApproach(ArrayList<Integer> h , int tar){
    int si = 0; 
    int ei = h.size()-1;
    while(si<ei){
        if(h.get(si)+ h.get(ei) == tar )return true;
        if(h.get(si)+ h.get(ei) > tar ){
            ei--;
        }else{
            si++;
        }
    }
    return false;
}

public static boolean pairSumSortedRotated2pointerApproach(ArrayList<Integer> list, int tar){
    int ei = 0;
    int sz = list.size();
    while(list.get(ei)<list.get(ei+1) && ei < sz-1){
        ei++;
    }
    int si = ei+1;
    while(si!= ei){
        if(list.get(si)+ list.get(ei) == tar )return true;
        if(list.get(si)+ list.get(ei) > tar ){
    ei = (sz + ei -1)% sz;
        }else{
     si = (si +1)% sz;
        }
    }

return false;

}

    public static void main(String args[]){
        System.out.println("hi");
        ArrayList<Integer> h = new ArrayList<>();
        // h.add(1);
        // h.add(2);
        // h.add(3);
        // h.add(4);
        // h.add(5);
        // h.add(6);
        h.add(11);
        h.add(15);
        h.add(6);
        h.add(8);
        h.add(9);
        h.add(10);
        
System.out.println(pairSumSortedRotated2pointerApproach(h, 100));
    }
}