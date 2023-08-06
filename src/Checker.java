public class Checker
{
    public static void execute()
    {
        // create two oblongs
        CheckableOblong oblong1 = new CheckableOblong(10, 8); // valid
        CheckableOblong oblong2 = new CheckableOblong(0, 8); // invalid: first argument is zero
        // send objects to the checkValidity method
        System.out.println("oblong1 is " + checkValidity(oblong1));
        System.out.println("oblong2 is " + checkValidity(oblong2));
    }
    private static String checkValidity(Checkable objectIn) // receives any Checkable object
    {
        if(objectIn.check()) // call the check method
        {
            return "valid";
        }
        else
        {
            return "invalid";
        }
    }
}