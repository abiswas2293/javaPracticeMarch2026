package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class subString {
    public static void main(String args[]){
        String s="dabcabcdebfdb";//longest substring
        char c[]=s.toCharArray();// [d,a,b,c,a,b,c,d,e,b,b]

       List<char[]> al = Arrays.asList(c); //[d,a,b,c,a,b,c,d,e,b,b]

        String temp="";
        String temp2="";

        for(int i =0; i<c.length; i++){ //d, a
            for(int j=i+1; j<c.length; j++){

                if(temp.isBlank()){
                    temp = temp + c[i]; //d
                    al.remove(i); //[a,b,c,a,b,c,d,e,b,b]
                    break;
                }
                else {
                    al.remove(i); //[b,c,a,b,c,d,e,b,b]
                    temp = temp + c[i]; //da

                    if(s.contains(temp)){

                    }


                }
            }

        }



        ArrayList<Character> al1=new ArrayList<>();



        for(int i=0;i<c.length;i++){ //c[0] --> a,b,c

                if(!al1.contains(c[i])){//empty --> a,b,c
                  temp=temp+c[i];//""+a+b+c
                  al1.add(c[i]);//a,b,c
                 // break;
                }
                else
                    continue;


        } System.out.println(temp);
    }
}
