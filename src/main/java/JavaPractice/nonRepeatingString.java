package JavaPractice;

import java.util.ArrayList;

public class nonRepeatingString {
    public static void main(String args[]){
        ArrayList<String> al=new ArrayList<>();
        al.add("apple");
        al.add("banana");
        al.add("apple");
        al.add("orange");
        al.add("banana");
        al.add("grape");

        ArrayList<String> ll=new ArrayList<>();

        for(String x:al){
            if(!ll.contains(x)){
                ll.add(x);
            }
        }System.out.println(ll);

    }
}
