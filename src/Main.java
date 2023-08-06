import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //Checker.execute();
    //InnerClass.execute();
    //AnonymousClass1.execute();
    //AnonymousClass2.execute();
    //TestGeneric.execute();

        /*CheckableCustomer customer1 = new CheckableCustomer("B123", "Alabi", 5000);
        System.out.println(customer1.check());*/

        /*Customer customer1 = new CheckableCustomer("0123", "Alabi", 5000);
        System.out.println(checkCustomerId( ()->{
            return customer1.getCustomerId().length() != 4 || Character.isAlphabetic(customer1.getCustomerId().charAt(0));
        }));*/

        System.out.println("Enter name:");
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.next();
        System.out.println("Your name is "+name);
        System.out.println("Enter age:");
        int age = keyboard.nextInt();
        System.out.println("Your age is "+age);
        System.out.println("Enter gender:");
        String gender = keyboard.next();
        System.out.println("Your gender is "+gender);
}

    private static String checkCustomerId(Checkable customer)
    {
        String status = "invalid";
        if(customer.check())
        {
            status = "valid";
        }
        return status;
    }
}