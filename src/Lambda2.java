public class Lambda2 {
    public static void execute()
    {
        testMethod(() -> System.out.println("Hello "));
    }
    static void testMethod(TestInterface testObjectIn)
    {
        testObjectIn.test();
    }
}
