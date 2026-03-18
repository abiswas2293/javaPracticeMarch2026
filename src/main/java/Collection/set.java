package Collection;

import java.util.*;

public class set {
    public static void main(String args[]){
        //HashSet<String> hs=new HashSet<>();
        LinkedHashSet<String> hs=new LinkedHashSet<>();

        hs.add("B");
        hs.add("M");
        hs.add("RTE");
        hs.add("X");
        hs.add("C");
        hs.add("F");
        hs.add("Y");
        hs.add("mango");
        System.out.println(hs);
        System.out.println(hs.contains("y"));

        List<String> ll=new ArrayList<>(hs);//if you need indexing for a set,let convert the linkedHashSet to list
        System.out.println(ll.get(1));

        TreeSet<String> ts=new TreeSet<>(hs);
        System.out.println(ts);



    }
}
