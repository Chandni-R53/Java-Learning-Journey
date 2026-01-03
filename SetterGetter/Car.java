package SetterGetter;

public class Car {
    private String color;
    private String model;
    private double fuel;
    private double price;
    Car(){

    }
    Car(String color,String model,double fuel,double price){
        this.color=color;
        this.model=model;
        this.fuel=fuel;
        this.price=price;
    }
    //getter
    public String getColor(){
        return color;
    }
    public String getModel(){
        return model;
    }
    //setter
    public void setFuel(double fuel){
        this.fuel=fuel;
        System.out.println("Fuel added successfully: "+this.fuel);
    }
    @Override
    public String toString() {
        return "Car-color: "+color+"\nCar-model: "+model+"\nCar-fuel: "+fuel+"\nCar-price: "+price;
    }
    public static void main(String[] args) {
        Car c1=new Car("Red","Swift",5.0,200000);
        System.out.println(c1);
        System.out.println(c1.getColor());
        System.out.println(c1.getModel());
        c1.setFuel(4);
       
    }
}
