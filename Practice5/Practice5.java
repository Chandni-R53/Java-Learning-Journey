package Practice5;
import java.util.Scanner;
public class Practice5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //password checker
        String pass;
        do{
            System.out.print("Enter the password: ");
            pass=sc.nextLine();
        }
        while(!pass.equals("MarryMe:)"));//to compare strings use .equals()
        System.out.println("Welcome to our home");
        //number guessing
        int num;
        do{
            System.out.print("Enter the number from 0 to 10: ");
            num=sc.nextInt();
        } while(num!=6);
        System.out.println("Your guess was correct");
        //use of for each loop
        //max number in array
        int[] a={12,34,543,23,11,12};
        int max=a[0];
        for(int i:a){
            if(i>max){
            max=i;} 
        }
        System.out.println("Max number is "+max);
        //occurence of key element in array
        System.out.print("Enter the element: ");
        int key=sc.nextInt();
        int count =0;
        for(int i:a){
            if(i==key){
            count++;} 
        }
        System.out.println("Total occurence of element is "+count);
        //read input from user until exit (use of break)
        sc.nextLine();
        String in;
        do{
            System.out.print("Enter the string input: ");
            in=sc.nextLine();
            if(in.equalsIgnoreCase("exit"))
            {break;}
        }while(true);
        System.out.println("Successfully exited");
        //use of continue
        int sum=0;
        while(sum<250){
        System.out.print("Enter the number: ");
        int num1=sc.nextInt();
        if(num1<0)
        {continue;}
        sum+=num1;
        System.out.println("Sum is "+sum);
        }
        //print only even numbers
        System.out.println("Even numbers between 1 to 20:");
        int n=1;
        while(n<=20){
            n++;
            if(n%2!=0) continue;
            System.out.print(n+" ");
        }
        //fibonacci series using recursion
        System.out.print("\nEnter a number: ");
        int number=sc.nextInt();
        System.out.println("fibonacci series upto "+number+" is:");
        for(int i=1;i<=number;i++){
            System.out.print(fib(i)+" ");
        }
        //string palindrome
        System.out.print("\nEnter the string: ");
        sc.nextLine();
        String str=sc.nextLine();
        System.out.println("The string is "+((isPalindrome(str)?"palindrome":"Not palindrome")));
    }
    public static int fib(int n){
      if(n==1)
      {return 0;}
      if(n==2)
      {return 1;}
    return fib(n-1)+fib(n-2);
    }
    //check palindrome using recursion
    public static boolean isPalindrome(String s){
        if(s.length()<=1)
        {return true;}
        int last=s.length()-1;
        if(s.charAt(0)!=s.charAt(last))
        {return false;}
        String newStr=s.substring(1,last);
        return isPalindrome(newStr);
    }
}
