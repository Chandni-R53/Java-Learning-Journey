package Methods;
import java.util.Scanner;
public class Methods {
    public static void main(String[] args) {
        System.out.println("Welcome "+userInput()+" to our coding class");
    }

    public static String userInput(){
        System.out.print("Enter your name:");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        return name;
    }
}
