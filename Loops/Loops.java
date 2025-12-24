package Loops;

public class Loops {
    public static void main(String[] args) {
        //printing countings 1 to 10 using while loop
        int a=1;
        while(a<=10){
            System.out.print(a+" ");
            a++;
        }
        System.out.println();

        //printing patterns using for loop
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++)
            {System.out.print("* ");}//right half pyramid
            System.out.println();
        }
        System.out.println();

        for(int i=0;i<5;i++){
            for(int j=5;j>i;j--)
            {System.out.print("* ");}//reverse right half pyramid
            System.out.println();
        }
        System.out.println();

        for(int i=0;i<5;i++){
            for(int k=4;k>i;k--)
            {System.out.print(" ");}
            for(int j=0;j<=i;j++)
            {System.out.print("*");}//left half pyramid
            System.out.println();
        }
    }
}
