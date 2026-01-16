package Practice10;

public class Eagle extends Bird {
    @Override
    public void fly(){
        System.out.println("Flying....");
    }
    public static void main(String[] args) {
        Eagle eagle=new Eagle();
        eagle.fly();
    }
}
