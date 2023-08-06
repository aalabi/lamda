public class CheckableCustomer extends Customer implements Checkable{

    public CheckableCustomer(String id, String name, double limit) {
        super(id, name, limit);
    }

    @Override
    public boolean check() {
        boolean isOk = true;
        if(getCustomerId().length() != 4 || !Character.isAlphabetic(getCustomerId().charAt(0))){
            isOk = false;
        }
        return isOk;
    }
}
