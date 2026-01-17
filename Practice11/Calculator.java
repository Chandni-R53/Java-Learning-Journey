package Practice11;

public class Calculator {
    public int add(int a,int b){
       return a+b;
    }
    public int add(int a,int b,int c){
       return a+b+c;
    }
    public double add(double a,double b){
       return a+b;
    }

    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println(c.add(22,12));
        System.out.println(c.add(22,12,11));
        System.out.println(c.add(22.455,12.01));
    }
}
