package Polymorphism;

public class Overloading {
    //constructor overloading
    public Overloading(){
        System.out.println("mew-mew");
    }
    public Overloading(int num){
        while(num>0){
        System.out.println("mew-mew");
        num--;
        }
    }
    //method overloading
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public String add(String a,String b){
        return a+b;
    }

    public static void main(String[] args) {
        Overloading obj1=new Overloading();
        System.out.println(obj1.add(5,4));
        System.out.println(obj1.add(5,4,10));
        System.out.println(obj1.add("Chandni","Rajawat"));
        Overloading obj2=new Overloading(5);
        
    }
}
