package Practice7;
import java.util.Scanner;
public class BankAccount {
    private String accHolder;
    private int accNumber;
    private double balance;
    //constructor
    public BankAccount(String name,int number){
        accHolder=name;
        accNumber=number;
        balance=0.0;
    }
    
    //getter
    public double getBalance(){
        return balance;
    }
    //methods
    public void deposit(double money){
        if(money<=0){
            System.out.println("Invalid amount!");
        }
        else{
        this.balance+=money;
        System.out.println("Your amount is deposited successfully!");
        }
    }
    public void withdraw(double money){
        if(money<=0){
            System.out.println("Invalid amount withdrawal!");
        }
        else if(money>balance){
            System.out.println("Amount can not be withdrawn!");
        }
        else{
            System.out.println("Your amount is withdrawn successfully!");
            balance-=money;
        }

    }
    //main method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name of account holder: ");
        String name=sc.nextLine();
        System.out.print("Enter the account number: ");
        int number=sc.nextInt();
        sc.nextLine();
        BankAccount obj=new BankAccount(name,number);
        
        System.out.print("Want to check your balance? Yes/No: ");
        String ans=sc.nextLine();
        if(ans.equalsIgnoreCase("yes")){
            System.out.println("Your total balance is "+obj.getBalance());
        }
        else{
            System.out.println("As you wish!");
        }
        System.out.print("Want to deposit or withdraw your money? withdraw/deposit: ");
        String res=sc.nextLine();
        if(res.equalsIgnoreCase("deposit")){
            System.out.print("Enter the amount to deposit: ");
            double money=sc.nextDouble();
            obj.deposit(money);
        }
        else{
            System.out.print("Enter the amount to withdraw: ");
            double money=sc.nextDouble();
            obj.withdraw(money);
        }
        System.out.println("Your total balance is "+obj.getBalance());

    }
}
