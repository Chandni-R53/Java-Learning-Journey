package Practice;
import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) {
        int N=userInput();
        multiply(N);
        System.out.println("\nIf you want sum of all odd numbers from 1 to n(specified number):");
        int n=userInput();
        int result=sumOfOdd(n);
        System.out.println("Result is: "+result);
        int number=userInput();
        System.out.println("Factorial of "+number+" is: "+factorial(number));
        int Number=userInput();
        System.out.println("Sum of the digits of "+Number+" is: "+ sumOfDigits(Number));
        n=userInput();
        System.out.println("Reverse of the digits of number "+n+" is: "+ revOfDigits(n));
        //n=userInput();
    }

    //taking input from user
    public static int userInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        return num;
    }
    //multiplication table
    public static void multiply(int n){
        System.out.print("Table of "+n+" is: ");
        for(int i=1;i<=10;i++){
            System.out.print(n*i+" ");
        }
    }
    //sum of all odd numbers
    public static int sumOfOdd(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0) sum+=i;
        }
        return sum;
    }
    //factorial of a number
    public static int factorial(int n){
        if(n<2) return 1;
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    //sum of the digits
    public static int sumOfDigits(int n){
        int Sum=0;
        for(int i=0;n>0;n=n/10){
            int lastDigit=n%10;
            Sum+=lastDigit; 
        }
        return Sum;
    }
    //reverse the digits of a number
     public static int revOfDigits(int n){
        int rev=0;
        while(n>0){
            int lastDigit=n%10;
            rev=rev*10+lastDigit; 
            n=n/10;
        }
        return rev;
    }
}
