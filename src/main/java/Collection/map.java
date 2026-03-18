package Collection;

import java.util.*;

public class map {
    public static void main(String args[]){
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",10);
        hm.put("USA",15);
        hm.put("London",17);
        hm.put("London",16);

        Set<Map .Entry<String,Integer>> set=hm.entrySet();//get a set of entries

        for(Map.Entry<String,Integer> me :set){
            System.out.print(me.getKey()+": ");
            System.out.println(me.getValue());
        }

        TreeMap<String,Integer> tm=new TreeMap<>();
        tm.put("John",10);
        tm.put("Tom",20);
        tm.put("Jane",50);

        Set<Map.Entry<String,Integer>> set1=tm.entrySet();
        for(Map.Entry<String,Integer> tme:set1){
            System.out.print(tme.getKey()+":");
            System.out.println(tme.getValue());
        }



    }
}
