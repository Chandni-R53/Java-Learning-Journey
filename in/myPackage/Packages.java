package in.myPackage;
import java.util.Scanner;
public class Packages {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        System.err.println("Hello "+name+", this is my own package");
    }
}
