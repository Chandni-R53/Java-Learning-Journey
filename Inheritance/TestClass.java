package Inheritance;

public class TestClass extends Student{

    TestClass(String name, int age, String gender) {
        super(name, age, gender);
        //TODO Auto-generated constructor stub
    }
    TestClass(){
        super("unknown",0,"unknown");
    }//default
    @Override
    public String toString() {
        return "Hello, I'm "+name;
    }
    public static void main(String[] args) {
        TestClass t1=new TestClass();
        TestClass t2=new TestClass("Chandni",21,"female");
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t1.getClass());
        System.out.println(t1.hashCode());
        
        //check equals()
        Student s1=new Student("Gaurav Pandey", 21, "male");
        Student s2=new Student("Gaurav Pandey", 21, "male");
        if(s1.equals(s2)){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not Equals");
        }
    }
    
}
