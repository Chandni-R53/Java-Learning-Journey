package Practice6;

public class Student {
    String name;
    int age;
    @Override
    public String toString() {
        return "Name:"+name+" and age:"+age;
    }
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Maria";
        s1.age=26;
        System.out.println(s1.toString());
    }
}
