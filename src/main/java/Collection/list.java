package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class list {
    public static void main(String args[]){
        ArrayList<String> al=new ArrayList<>();
        al.add("abc");
        al.add("xyz");
        al.add("mno");
        al.add("rst");

        al.add(1,"rto");
        System.out.println(al);


        System.out.println(al.contains("abc"));
       System.out.println(al.containsAll(al));
        System.out.println(al.containsAll(List.of("abc", "xyz", "mno","efgh")));

        String[] s = al.toArray(new String[0]);
        System.out.println(Arrays.toString(s));
    }
}
