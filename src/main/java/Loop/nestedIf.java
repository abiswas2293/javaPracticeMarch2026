package Loop;

public class nestedIf {
    public static void main(String args[]){
        int age=16;
        boolean hasTicket=true;

        if(age>=16){
            if(hasTicket){
                System.out.println("Welcome!You can travel");
            }
            else{
                System.out.println("Sorry you needs ticket to travel");
            }
        }
        else{
            System.out.println("You are too young to travel");
        }
//==========================================================
        int marks=82;
        int attendance=74;

        if(marks>=70){
            if(attendance>60){
                System.out.println("You are passed and eligible for next semester");
            }
            else{
                System.out.println("Your attendance is low,not eligible for next semester");
            }
        }
        else {
            System.out.println("You are fail");
        }
        //=============================


    String username="abc";
        String password="123";
        boolean isActive=true;

        if(username.equals("abc")){
            if(password.equals("123")){
                if(isActive){
                    System.out.println("Login successful");
                }
                else{
                    System.out.println("Account is deactivated");
                }
            }
            else{
                System.out.println("Wrong password");
            }
        }
        else{
           System.out.println("Wrong Username");
        }


    }
}
