package Datatypes;

public class classAsReference {


    String brand;
    int year;
    boolean isElectric;

    classAsReference(String s, int i, boolean b) {
        brand = s;
        year = i;
        isElectric = b;
    }

    public static void main(String args[]) {
        classAsReference myCar = new classAsReference("Tesla", 2015, true);
        classAsReference yourCar = myCar;

        yourCar.year = 2026;
        yourCar.isElectric=false;

        System.out.println(myCar.year);
        System.out.println(myCar.isElectric);


    }
}

