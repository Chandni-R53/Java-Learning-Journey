package Methods;
import java.util.Scanner;
public class Methods {
    public static void main(String[] args) {
        System.out.println("Welcome "+userInput()+" to our coding class");
        int n1=readNumber();
        int n2=readNumber();
        int result=sum(n1,n2);
        System.out.print(result);
    }

    public static String userInput(){
        System.out.print("Enter your name:");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        return name;
    }

    public static int readNumber(){
        System.out.print("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        return num;
    }

    public static int sum(int n1,int n2){
      return n1+n2;
    }
}
