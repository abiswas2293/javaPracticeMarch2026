package methods;

public class cat extends animal{
    public void sound(){
        System.out.println("meow");
    }
    public static void main(String args[]){
      animal a;

      a=new dog();
      a.sound();

      a=new cat();
      a.sound();

      a=new animal();
      a.sound();


    }
}
