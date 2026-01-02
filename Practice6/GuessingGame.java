package Practice6;
import java.util.Scanner;
public class GuessingGame {
    int random;
    public void guessNum(){
        random=(int)(Math.ceil(Math.random()*100));
    }
    public int userGuess(int numberGuess){
        return numberGuess-random;
        //0 for correct guess
        //negative for lower guess
        //positive for higher guess
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        GuessingGame g=new GuessingGame();
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("The computer will think of a number between 1 to 100 and you have to guess it");
        g.guessNum();
        int result;
        do{
        System.out.print("Enter your number: ");
        int num=Sc.nextInt();
        result=g.userGuess(num);
        if(result==0){
            System.out.println("Your guess was correct");
        }
        else if(result>0){
            System.out.println("Guess lower");
        }
        else{
            System.out.println("Guess Higher");
        }
    } while(result!=0);
}
}