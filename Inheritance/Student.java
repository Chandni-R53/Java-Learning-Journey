package Inheritance;

public class Student extends Teacher{
    private int roll;

    Student(String name, int age, String gender) {
        super(name, age, gender);
    }
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Student)){
            return false;
        }
        Student s=(Student)obj;
        return s.name.equals(name)&&s.age==age&&s.gender.equals(gender);
    }
    
     
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
