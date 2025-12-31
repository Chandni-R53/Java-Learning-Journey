package Practice4;
import java.util.Scanner;
public class Practice4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //min of two numbers using ternary operator
        System.out.print("Enter two numbers:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int min=n1<n2?n1:n2;
        System.out.println("The min number is "+min);
        //even odd 
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        boolean ans=fun(n);
        if(ans){
            System.out.println("Even number");
        }
        else{
           System.out.println("Odd number"); 
        }
        //absolute
        int num=abs(n);
        System.out.println("The absolute value is "+num); 
        //student score
        System.out.print("Enter the student's marks:");
        int m=sc.nextInt();
        String Score=score(m);
        System.out.println("Student's score is "+Score);
        //print month of the year
        System.out.print("Enter a number from 1 to 12: ");
        int number=sc.nextInt();
        String month=monthOfYear(number);
        System.out.println("The month is "+month);
        //calculator
        System.out.println("This calculator can perform:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        System.out.print("Select the no. of operation you want to perform:");
        int op=sc.nextInt();
        System.out.print("Enter two numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int res=solution(num1,num2,op);
        System.out.print("The result is: "+res);
        
    }
    //even odd using ternary operator
    public static boolean fun(int n){
        boolean res=n%2==0?true:false;
        return res;
    }
    //absolute value of integer
    public static int abs(int n){
        int num=n<0?-n:n;
        //if(n<0){return -n;}
        //else{ return n;}
        return num;
    }
    //calculate student score using ternary
    public static String score(int m){
        String s=m>=80?"High":(m>=50?"Moderate":"Low");
        return s;
    }
    //print month of the year based on number 
    public static String monthOfYear(int n){
        String s=switch(n){
            case 1->"Jan";
            case 2->"Feb";
            case 3->"March";
            case 4->"April";
            case 5->"May";
            case 6->"June";
            case 7->"July";
            case 8->"Aug";
            case 9->"Sep";
            case 10->"Oct";
            case 11->"Nov";
            case 12->"Dec";
            default->"Invalid";
        };
        return s;
    }
    //simple calculator
    public static int solution(int n1,int n2,int n){
        int res=0;
        switch(n){
            case 1: res=n1+n2;
                    break;
            case 2: res=n1-n2;
                    break;
            case 3: res=n1*n2;
                    break;
            case 4: res=n1/n2;
                    break;
            default: System.out.println("Invalid");
        }
             return res;
    
}
}
