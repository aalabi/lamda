public class TestGeneric {
    public static void execute()
    {
        SimpleGeneric<Double> example1 = new SimpleGeneric<>();
        SimpleGeneric<String> example2 = new SimpleGeneric<>();
        SimpleGeneric<Oblong> example3 = new SimpleGeneric<>();
        example1.setValue(10.0);
        example2.setValue("Hello");
        example3.setValue(new Oblong(5, 3));
        System.out.println(example1.getValue());
        System.out.println(example2.getValue());
        System.out.println(example3.getValue().calculateArea());
    }
}
