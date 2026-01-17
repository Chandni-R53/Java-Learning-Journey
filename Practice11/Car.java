package Practice11;

public class Car extends Vehicle {
    @Override
    public void service(){
        super.service();
        System.out.println("hello, I'm a car");
    }
    public static void main(String[] args) {
        Vehicle v= new Vehicle();
        Car c=new Car();
        v.service();
        c.service();
    }
}
