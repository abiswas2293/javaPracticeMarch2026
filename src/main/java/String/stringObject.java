package String;

public class stringObject {
    public static void main(String args[]){
        char c[]={'j','a','v','a'};
        System.out.println(String.valueOf(c));

        String s1=new String(c);
        String s2=new String(s1);

        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);

        String s3="cde";
        System.out.println("cde".length());



    }
}
