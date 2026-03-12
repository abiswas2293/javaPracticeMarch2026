package Loop;

public class returnInJava {

    public void method_nonReturnType(int a,int b){
        System.out.println("Non-return "+(a+b));

    }

    public int method_returnType(int a,int b){
        System.out.println("hello world");
        return a+b;
    }


    public static void main(String args[]){
        returnInJava obj=new returnInJava();
        obj.method_nonReturnType(23,89);//non-return 112

        System.out.println(obj.method_returnType(23,67));//hello world//90


        int a=3,b=6,c;
        c=a+b;
        c=34;
        int d=c;
        int e=obj.method_returnType(12,45);//hello world

        if(c==34){
            System.out.println("true");//true
        }
        else
            System.out.println("false");


        if(obj.method_returnType(12,35)>90){//hello world
            System.out.println("the addition of two numbers is greater than 90");
        }
        else
            System.out.println("the addition of two numbers is less than or equals to 90");//the addition of two numbers is less than or equals to 90
    }
}
