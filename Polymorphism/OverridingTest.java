package Polymorphism;

public class OverridingTest {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        Car c=new Car();
        Bike b=new Bike();
        c.start();
        b.start();
        v.start();
    }
}
