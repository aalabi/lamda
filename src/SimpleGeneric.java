public class SimpleGeneric <T>{
    private T value;
    public void setValue(T valueIn)
    {
        value = valueIn;
    }
    public T getValue()
    {
        return value;
    }
}
