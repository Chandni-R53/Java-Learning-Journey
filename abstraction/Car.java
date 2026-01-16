package abstraction;

public class Car extends Vehicle {
    //private int tyres;
     
    public Car(int tyres){
        super(tyres);
    }

    @Override
    public void makeSound(){
        System.out.println("bruhhhh.....");
    }

    @Override
    public void getSetGo(){
        System.out.println("Going....");
    }
}
