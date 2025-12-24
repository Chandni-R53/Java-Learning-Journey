package UserInput;
import java.util.Scanner;//imports the Scanner class to handle user input
public class UserInput {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name:");
            String name=sc.nextLine();
            System.out.print("Enter your age:");
            int age=sc.nextInt();
            sc.nextLine();//to handle enter key buffer
            System.out.print("Enter your branch:");
            String branch=sc.nextLine();

            System.out.println("Your details are shown below:");
            System.out.println(name);
            System.out.println(age);
            System.out.println(branch);
        
    }
}
