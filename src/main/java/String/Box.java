package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box {
    //  int height;
    //  int width;
    //  int depth;

    // Box(int a,int b,int c){
    // height=a;
    //  width=b;
    //depth=c;

    //   }
    Box() {

    }

    ;

   /* public String toString(){
        return "dimension is"+2+4;
    }

*/

    String setOfExceptions[] ={"NullPointer", "ArrayOutOfIndex", "NoSuchElementFound"};

   // ArrayList<String> al=new ArrayList<>(List.of("NullPointer", "ArrayOutOfIndex", "NoSuchElementFound"));

    List<String> al=Arrays.asList(setOfExceptions);




    public void Volume(int x, int y) {
        try {
            System.out.println("Volume is " +( x / y));
        } catch (Exception e) {
            int temp=0;
            for (String s : this.setOfExceptions) {
                if (e.toString().contains(s)) {
                    System.out.println("exception belongs to the declared set of exception" + e);
                    break;
                } else{
                    temp++;
                    continue;
                }
                   // System.out.println("Exception is not declared in set of exception, the actual exception is " + e);


            }
            if(temp==this.setOfExceptions.length){
                System.out.println("Exception is not declared in set of exception, the actual exception is " + e+" but required exceptions are "+ Arrays.asList(this.setOfExceptions));
            }
        }
    }


    //public String toString(){
    //  return "Dimensions are "+height+width+depth;
    //  }

    public static void main(String args[]) {
        //Box b=new Box(1,3,6);
        //System.out.println(b);
        Box b = new Box();
        System.out.println(b);
        b.Volume(23, 0);
    }

}
