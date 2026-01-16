package Practice9;

public class Circle extends Shape{
    private double radius;
    public Circle(double r){
        radius=r;
    }
    @Override
    public double calculateArea(){
        return Math.PI*Math.pow(radius,2);
    }
}
