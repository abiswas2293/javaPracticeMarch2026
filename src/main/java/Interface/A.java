package Interface;

interface A {

    void name();
    void age();
    void school();

  default void method(){ //when we use default method in interface ,it breaks 100% abstraction of interface,we use default for backward compatibility so when
        System.out.println(20); //we use default method instead of using any method to interface it does not break all existing implementation of interface
    }
                                     //but in interview we will say interface allows 100 % abstraction and multiple inheritence

     final int a=1;
}
