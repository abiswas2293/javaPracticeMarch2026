package methods;

public class constructor {
    int age;
    String name;
    String school;

    constructor(int a,String n,String s){
        age=a;
        name=n;
        school=s;

    }
    constructor(int x){
        age=x;
        System.out.println("It is a default message");

    }
    constructor(){
        System.out.println("Going home");
    }

    public static void main(String args[]){
        constructor c=new constructor();
        constructor c1=new constructor(20);
        constructor c2=new constructor();



    }
}
