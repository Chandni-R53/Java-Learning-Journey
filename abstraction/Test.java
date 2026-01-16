package abstraction;

public class Test {
    public static void main(String[] args) {
        //Vehicle v=new Vehicle(4); //abstract class can't be instantiated
        Car c1=new Car(4);
        System.out.println(c1.getTyres());
        c1.setTyres(2);
        System.out.println(c1.getTyres());
        c1.makeSound();
        c1.getSetGo();
    
    }
}
