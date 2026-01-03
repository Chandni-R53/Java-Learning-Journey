package AccessModifiers;

public class useOfPrivate {
    private int pin;
    public static void main(String[] args) {
        defaultClass ob=new defaultClass();
        ob.balance=260000;//default can be accessible inside the same package
        PublicClass object=new PublicClass("Chandni",12463473,750000);
        System.out.println(object);
        useOfPrivate p=new useOfPrivate();
        p.pin=12043;//private can be accessible in its defining class only
    }
}
