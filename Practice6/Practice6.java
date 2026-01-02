package Practice6;
import java.util.Scanner;
public class Practice6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1="Fantastic";
        String s2=" & Fabulous";
        String s3=s1+s2;
        //result of string in uppercase
        System.out.printf("%S",s3);
        System.out.println("\n"+s3.toUpperCase());
        
        //use math.pi to calculate area and circumference of circle
        System.out.print("Enter radius of circle:");
        float r=sc.nextFloat();
        System.out.println("Area of circle is "+Math.PI*r*r);
        System.out.println("Circumference of circle is "+2*Math.PI*r);

        //display outcome of dice roll
        System.out.println("Rolling the dice...");
        for(int i=0;i<10;i++){
        System.out.println("Outcome: "+(int)(Math.ceil(Math.random()*6)));
        }
        //guessing game
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("The computer will think of a number between 1 to 100 and you have to guess it");
        System.out.print("Enter your number: ");
        int num=sc.nextInt();
        double random =Math.random()*100;
        int n=(int)(Math.ceil(random));
        System.out.println("Output: "+(num==n?"Your guess was correct":"Not correct, try again"));
        System.out.println("The number was: "+n);

        //concatenate the array of words
        String[] str={"Hello everyone,", "my name", "is", "Chandni Rajawat", "and I am", "from IoT branch"};
        StringBuilder s=new StringBuilder("");
        for(String i:str){
            s.append(i).append(" ");
        }
        System.out.println(s);
    }
}
