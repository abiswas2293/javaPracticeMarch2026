package Collection;

import java.util.LinkedList;

public class linkedList {
    public static void main(String args[]){
        LinkedList<String> ll=new LinkedList<>();
        ll.add("xyz");
        ll.add("mno");
        ll.add("pyo");
        ll.addFirst("A2");
        ll.add(0,"A");
        ll.addLast("T");
        System.out.println(ll);



    }
}
