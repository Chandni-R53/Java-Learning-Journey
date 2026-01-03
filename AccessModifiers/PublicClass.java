package AccessModifiers;

public class PublicClass {
    public String name;
    private long accountNo;
    private long balance;

    PublicClass (){

    }
    PublicClass (String name,long accountNo,long balance){
        this.name=name;
        this.accountNo=accountNo;
        this.balance=balance;
    }
    @Override
    public String toString() {
        return "Name-> "+name+"\nAccount Number-> "+accountNo+"\nBalance-> "+balance;
    }
 
}
