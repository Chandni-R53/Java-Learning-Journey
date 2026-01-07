package Practice8;

public class Person {
    private String name;
    private int age;
    
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Person)){
            return false;
        }
        Person p=(Person)obj;
        return p.name.equals(name)&&p.age==age ;
    }
    @Override
    public int hashCode() {
        
        return super.hashCode();
    }
    public static void main(String[] args) {
        Person p1=new Person("Chandni",21 );
        Person p2=new Person("Chandni",21 );
        if(p1.hashCode()==p2.hashCode()){
            System.out.println("equals");
        }
        else{
            if(p1.equals(p2)){
                System.out.println("equals");
            }
            else{
                System.out.println("not equal");
            }
        }

    }
}
