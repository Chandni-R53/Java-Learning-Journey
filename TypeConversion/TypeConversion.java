package TypeConversion;

public class TypeConversion {
    public static void main(String[] args) {
        double num=24.3f;//implicit conversion, from float to double
        System.out.println(num);

        int num2=(int)15.4f;//explicit conversion, from float to int
        System.out.println(num2);

        //using escape sequences
        System.out.print("*\n");// '\n' moves to the next line
        System.out.print("**\n");
        System.out.print("***\n");
        System.out.print("****\n");
        System.out.print("*****\n");

        System.out.println("Hello\tWorld");// '\t' inserts a tab space
        System.out.println("Hello, there \"How're you?\":)) ");// use \" to display " in string
    }
}
