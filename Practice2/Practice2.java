package Practice2;
import java.util.Scanner;
public class Practice2 {
    public static void main(String[] args) {
        /*int N=userInput();
        palindrome(N);
        N=userInput();
        armstrong(N);
        N=userInput();
        fibonacci(N);
        System.out.println();
        N=userInput();
        prime(N);*/
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter two numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("LCM of given two numbers is: "+LCM(num1,num2));
        System.out.println("GCD of given two numbers is: "+GCD(num1,num2));
    }

    //taking input from user
    public static int userInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        return num;
        
    }
    //to check a palindrome number
    public static void palindrome(int n){
        int original=n;
        int rev=0;
        while(n>0){
            int lastDigit=n%10;
            rev=rev*10+lastDigit; 
            n=n/10;
        }
        if(rev==original)
        {System.out.println("The number is palindrome");}
        else
        {System.out.println("The number is not palindrome");}
    }
    //to check armstrong number
    public static void armstrong(int n){
        int org=n;
        int count=0;
        int sum=0;
        int digit;
        while(n>0){
           count++;
           n=n/10;
        }
        n=org;
        while(n>0){
            digit=n%10;
            sum+=Math.pow(digit,count);
            n=n/10;
        }
        if(sum==org)
        {System.out.println("The number is armstrong");}
        else
        {System.out.println("The number is not armstrong");}
    }
    //fibonacci series
    public static void fibonacci(int n){
        int n1=1;
        int n2=1;
        System.out.print("The fibonacci series upto "+n+" is: 1 1 ");
        for(int i=2;i<=n;i++){
            int n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
    //to check prime number
    public static void prime(int n){
        if(n<2)
        {System.out.println("Prime number starts from 2");}
        for(int i=2;i<n;i++){
            if(n%i==0)
            {System.out.println("Number is not prime");}
            else
            {System.out.println("Number is prime");}  
        }
    }
    //LCM of two numbers
    public static int LCM(int n1,int n2){
        for(int i=1;i<=n2;i++){
            int ans=n1*i;
            if(ans%n2==0)
            {return ans;}
        }
        return 0;
    }
    //GCD of two numbers
    public static int GCD(int n1,int n2){
        int gcd=1;
        int smallest=least(n1,n2);
        for(int i=2;i<=smallest;i++){
            if(n1%i==0&&n2%i==0)
            {gcd=i;}
        }
        return gcd;
    }
    //to find least of two numbers
    public static int least(int n1,int n2){
        if(n1<n2) return n1;
        else return n2;
     }
}
