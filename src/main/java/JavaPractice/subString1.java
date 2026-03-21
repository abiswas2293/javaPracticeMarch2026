package JavaPractice;

import java.util.HashSet;

public class subString1 {

    public static void main(String args[]){
        String s="dabcabcdebfdb";
        char c[]=s.toCharArray();

        HashSet<Character> hs=new HashSet<>();
        String temp="";
        for(int i=0;i<c.length;i++){


            for(int j=0;j<c.length;j++){
                if(!hs.contains(c[i]) && c[i]!=c[j]){
                    //hs.add(c[i]);
                    temp=temp+c[i];
                    break;
                }
            }
        }System.out.println(temp);
    }
}
