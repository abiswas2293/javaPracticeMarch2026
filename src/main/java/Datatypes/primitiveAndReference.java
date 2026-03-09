package Datatypes;

public class primitiveAndReference {

        public static void main(String[] args) {
            // Primitive – value copy
            int a = 10;
            int b = a;
            b = 50;
            System.out.println(a);   // 10   ← unchanged


            int[] array1 = {1, 2, 3};          // 1D array
            int[] array2 = array1;

            array2[0] = 20;

            System.out.println(array1[0]);

            String s="abc";
            String s1=s;

            s1="xyz";
            System.out.println(s);


        }}

