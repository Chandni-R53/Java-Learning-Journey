package Polymorphism;

public class Test {
    public static void main(String[] args) {
        Vehicle v1=new Car();//upcasting, obj of child in ref. of parent
        Vehicle v2=new Bike();
        //Car c= new Vehicle(); //obj. of parent isn't allowed in childref.
        //Car c=(Car) new Vehicle();// it gives runtime error
        //c.start();
        v1.start();
        v2.start();
        if(v1 instanceof Car){
        Car c=(Car)v1;//downcasting
        c.start();
        }
       

    }
}