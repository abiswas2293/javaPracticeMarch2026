package JavaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Palindrome {

    public static void main(String args[]){

    String s= "racecar";
    String s1 = "apple";
    //create a program which detects if a string is palindrome or not, eg. madam

        char c[]=s.toCharArray();

       String temp="";

        for(int i=c.length-1;i>=0;i--) {
            temp = temp + c[i];
        }
        if(s.equals(temp)){
            System.out.println(s +" is a palindrome");
        }
        else{
            System.out.println(s+" is not a palindrome");
        }



}}
