package JavaPractice;

public class ReverseAString {
    public static void main(String args[]){

    String s = "cheetah";
    char c[]=s.toCharArray();
    String temp="";

    for(int i=c.length-1;i>=0;i--){
        temp=temp+c[i];



    }System.out.println(temp);

}}
