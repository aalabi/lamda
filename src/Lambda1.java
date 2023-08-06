public class Lambda1 {
    public static void execute()
    {
        testMethod(() -> System.out.println("Hello "));
    }
    static void testMethod(TestInterface testObjectIn)
    {
        testObjectIn.test();
    }
}
