package Practice12;
import java.util.Scanner;
public class Exception {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        try{
        int ans=n1/n2;
        System.out.println("The result of division is "+ans);
        }catch(ArithmeticException e){
            System.out.println("division by zero is not allowed, please enter the valid number");
        }

    }
}
