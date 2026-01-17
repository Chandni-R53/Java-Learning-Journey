package Polymorphism;

public class Car extends Vehicle {
     
    @Override //annotation
    public void start(){
        super.start();
        System.out.println("Car is starting...");
    }
    
}
