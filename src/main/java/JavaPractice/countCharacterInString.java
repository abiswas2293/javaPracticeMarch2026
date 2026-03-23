package JavaPractice;

import java.util.ArrayList;

public class countCharacterInString {
    public static void main(String args[]){
        String s="banana";//a=3,n=2 and a3n2
        String s1="";
        char[] c=s.toCharArray();
        ArrayList<Character> al=new ArrayList<>();
        for(int i=0;i<c.length;i++){
            int temp=1;
            if(al.contains(c[i])){
                continue;
            }
            for(int j=i+1;j<c.length;j++){
                if(c[i]==c[j]){
                    al.add(c[i]);
                    temp++;
                }

            }if(temp>1){
                s1=s1+c[i]+temp;
                System.out.println(c[i]+"="+temp);
            }


        }System.out.println(s1);



    }
}
