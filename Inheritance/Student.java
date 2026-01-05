package Inheritance;

public class Student extends Teacher{
    Student(String name, int age, String gender) {
        super(name, age, gender);
    }


    private int roll;
    
     
    public static void main(String[] args) {
        Person p=new Person();
        Teacher t=new Teacher("Dr. D.B.", 36, "Male");
        Student s=new Student("Chandni",21,"Female");
        String Name=s.getName();
        System.out.println(Name);
        System.out.println(t.getName());
        t.setSalary();
        t.sleeping();
        s.institute="MITS,Gwalior";
    }
}
