package Conditionals;
import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       //to check whether a number is positve or negative
       System.out.print("Enter a number:");
       int num=sc.nextInt();
       if(num>0) System.out.println("Positive");
       else if(num<0) System.out.println("Negative");
       else System.out.println("Zero");
        
       //to check even or odd
       System.out.print("Enter a number:");
       int n=sc.nextInt();
       if((n&1)==0) System.out.println("Even");
       else System.out.println("Odd");

       //to check greater of three numbers
       int a=4,b=6, c=12;
       if(a>=b&&a>=c) System.out.println("max number is "+a);
       else if(b>=c) System.out.println("max number is "+b);
       else System.out.println("max number is "+c);

       //to check the leap year
       System.out.print("Enter the year:");
       int yr=sc.nextInt();
       if((yr%4==0&&yr%100!=0)||yr%400==0) System.out.println("leap year");
       else System.out.println("not a leap year");

       //to check the grade acc. to percentage
       System.out.print("Enter the marks in %:");
       float m=sc.nextFloat();
       if(m>=90) System.out.println("Grade A");
       else if(m>=75) System.out.println("Grade B");
       else if(m>=60) System.out.println("Grade C");
       else if(m>=30) System.out.println("Grade D");
       else if(m<30) System.out.println("Grade F");


    }
}
