package Loop;

public class ifElse {
    public boolean ifElseCondition(int age){
        if(age>=18){
            System.out.println("You can vote");
        }
        else{
           System.out.println("You can not vote");
        }

        return true;
    }

    public boolean selectSeason(int month){
        if(month==4){
            System.out.println("This is summer");
        }
        else if(month==10){
            System.out.println("This is winter");
        }
        else if(month==8){
            System.out.println("This is Autumn");
        }
        return false;
    }

    public static void main(String args[]){
        ifElse ie=new ifElse();
        System.out.println(ie.ifElseCondition(17));

        System.out.println(ie.selectSeason(10));

        int marks=80;
        if(marks>=90){
            System.out.println("Grade a+");
        }
        else if(marks>=70){
            System.out.println("Grade B+");
        }
        else{
            System.out.println("Grade C");
        }


        int temperature=38;
        if(temperature>30){
            System.out.println("Its very hot!Turn on AC");
        }
        }




    }

