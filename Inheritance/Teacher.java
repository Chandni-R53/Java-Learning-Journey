package Inheritance;

public class Teacher extends Person{
    protected double salary;
    protected String institute;

    public void setSalary(){
        this.salary=50000;
        System.out.println(salary);
    }

    Teacher(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
}
