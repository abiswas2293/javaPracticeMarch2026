package String;

public class subString {
    public static void main(String args[]){
        String s="it is the best time of the year      ";

        int i=s.indexOf('t');
        int j=s.lastIndexOf('t');

        String s1="one";
        String s2=s1.concat("two");
        String s3=s1.replace('o','x');

        System.out.println(i);
        System.out.println(j);

        System.out.println(s2);

        System.out.println(s3);

        System.out.println(s.trim());



    }
}
