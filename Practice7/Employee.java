package Practice7;

public class Employee {
    private String name;
    private int age;
    private double salary;
    //getter/setter
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    //default method to display details (package-private)
    String getEmployeeDetails(){
        return "Employee name: "+name+"\nEmployee age: "+age+"\nEmployee salary: "+salary;
    }
}
