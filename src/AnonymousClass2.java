public class AnonymousClass2 {
    public static void execute(){

        Oblong testOblong = new Oblong(8,8);
        System.out.println("oblong is "+checkValidity(new Checkable() {
            @Override
            public boolean check() {
                return testOblong.getLength() > 0 && testOblong.getHeight() > 0;
            }
        }));
    }
    private static String checkValidity(Checkable objectIn)
    {
        if(objectIn.check())
        {
            return "valid";
        }
        else
        {
            return "invalid";
        }
    }
}
