package ExceptionHandling;
import java.util.Scanner;
public class TryCatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        try{ 
            int a[]=new int[5];
            a[6]=num1/num2;
            //int result=num1/num2;
            // System.out.println(result);
            System.out.println(a[6]);
        }catch(ArithmeticException exc){
            System.out.printf("%s, enter valid number ",exc.getMessage());
        }catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("array is out of bound");
        }catch(Throwable th){
            System.out.println("General exception");
        }
    }
}
