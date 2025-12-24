package Operators;
import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        //Unary operators
        int N=12;
        System.out.println(N--);
        System.out.println(N);
        System.out.println(--N);
        System.out.println(N);
        System.out.println(N++);
        System.out.println(++N);

        //Arithmetic operators
        System.out.print("Enter two numbers:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(n1+n2);//addition
        System.out.println(n1-n2);//subtraction
        System.out.println(n1*n2);//multiplication
        System.out.println(n1/n2);//division
        System.out.println(n1%n2);//modulus

        //Relational operators
        int x=34,y=22;
        if(x>y) System.out.println("true");
        if(x==y) System.out.println("true");
        if(x<=y) System.out.println("true");
        if(x>=y) System.out.println("true");

        // Logical operators
        int a = 15;
        int b = 20;
        int c = 11;
        System.out.println(a < b && a > c);// Logical AND (&&)
        System.out.println(a > b || a > c);// Logical OR (||)
        System.out.println(!(a < b));//Logical NOT (!) 

        // Bitwise operators 
        int p=10, q=14;
        System.out.println("bitwise AND: "+(p&q));
        System.out.println("bitwise OR: "+(p|q));
        System.out.println("bitwise XOR: "+(p^q));
        System.out.println("bitwise compliment: "+(~p));
        System.out.println("bitwise left shift: "+(p<<1));
        System.out.println("bitwise right shift: "+(p>>1));

        //check even odd using xor
        System.out.print("Enter a number:");
        int num1=sc.nextInt();
        if((num1^1)==num1-1) System.out.println("Odd");
        else System.out.println("Even"); //for even (num1^1)==num1+1
        
        //swapping of numbers
        int A=5;
        int B=6;
        System.out.println("A="+A+" and B="+B);
        A=A+B;
        B=A-B;
        A=A-B;
        System.out.println("after swapping");
        System.out.println("A="+A +" and B="+B);
        
        //calculate SI and CI
        System.out.print("Enter principle amount:");
        float P=sc.nextFloat();
        System.out.print("Enter rate:");
        float R=sc.nextFloat();
        System.out.print("Enter time:");
        float T=sc.nextFloat();
        System.out.println("S.I="+ (P*R*T)/100);//Simple Interest=(P*R*T)/100
        System.out.println("C.I="+ P*Math.pow((1+R/100),T));//Compound Interest=P(1+R/100)^t and Math.pow use double
        
        //calculate temperature
        System.out.print("Enter the temperature in F :");
        float F=sc.nextFloat();
        float C=(F-32)*5/9;//celcius=(Fahrenite-32)*5/9
        System.out.println("Temperature in degree celcius:"+C);
    }
}

