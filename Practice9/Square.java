package Practice9;

public class Square extends Shape {
    private double side;
    public Square(double s){
        side=s;
    }
    @Override
    public double calculateArea(){
        return Math.pow(side,2);
    }
}
