package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class findDuplicateWords {
    public static void main(String args[]) {
        String sentence = "the quick brown fox jumps over the lazy fox dog";//"the","fox"
        String[] words=sentence.split("\\s+");

        List<String> ll=new ArrayList<>();
        List<String> ls=new ArrayList<>();
        for(String word:words){
            ll.add(word);

        }
        System.out.println(ll);
        for(int i=0;i<ll.size()-1;i++){
            for(int j=i+1;j<ll.size()-1;j++){
                if(ll.get(i).equals(ll.get(j))){
                    ls.add(ll.get(i));
                }
            }
        } System.out.println(ls);


    }}

