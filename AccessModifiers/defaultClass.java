package AccessModifiers;

class defaultClass {
    int balance;
    public static void main(String[] args) {
        PublicClass obj=new PublicClass();
        System.out.println(obj);
        obj.name="Chandni";//public
       // obj.balance=56000;
       //private, so can't be accessible
    }
}
