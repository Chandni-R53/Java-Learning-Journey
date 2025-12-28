package ClassAndObject;
public class Teacher {
    //attributes
    String name;
    int age;
    String dept;
    String sub;
    long salary;

    //methods
    public void Name(String n){
        System.out.println("Teacher's name is "+n);
    }
    public void Age(int age){
        this.age-=0;
        System.out.println("Teacher's age is "+age);
    }
    public void Department(String d){
        System.out.println("Teacher's department is "+d);
    }
    public void Subject(String s){
        System.out.println("Teacher's subject is "+s);
    }
    public Teacher Salary(double sal){
        sal+=500;
        System.out.println("Teacher's salary is "+sal);
        return this;
    }
    //dhfjskskaajdyebcnxkjcjloismncmnhjgncm,clkbshhsiudqdkdcz
    //sjkahjahsh2137542743873885ry39r8y

    //main method
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.Name("Mr. Aditya Dubey");
        t1.Age(38);
        t1.Department("Center for IoT");
        t1.Subject("Data Structure");
        //t1.Salary(70000);
        Teacher newSalary=t1.Salary(70000);
    }

}
