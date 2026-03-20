package JavaPractice;

import java.util.ArrayList;
import java.util.HashSet;

public class subString {
    public static void main(String args[]){
        String s="aabcabcdebb";//abcde
        char c[]=s.toCharArray();// [a,b,c,a,b,c,d,e,b,b]

        ArrayList<Character> al=new ArrayList<>();

        String temp="";

        for(int i=0;i<c.length;i++){ //c[0] --> a,b,c

                if(!al.contains(c[i])){//empty --> a,b,c
                  temp=temp+c[i];//""+a+b+c
                  al.add(c[i]);//a,b,c
                 // break;
                }
                else
                    continue;


        } System.out.println(temp);
    }
}
