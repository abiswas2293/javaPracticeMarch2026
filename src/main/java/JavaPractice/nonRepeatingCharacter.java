package JavaPractice;

public class nonRepeatingCharacter {
    public static void main(String args[]){

    String s="aabbccddeffg";//output "eg"
    char c[]=s.toCharArray();//{'a','a','b','b','c','c','d','d','e','f','f','g'}
        String temp="";

    for(int i=0;i<c.length;i++) {
        if(i==c.length-1){
            temp=temp+c[i];
        }
        else if (c[i] == c[i + 1]) {
            i++; //to skip i=1
            continue;
        } else {
            temp = temp + c[i];
        }
    }System.out.println(temp);

    }}
