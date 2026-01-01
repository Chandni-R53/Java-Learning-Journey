package ToStringMethod;

public class ToStringMethod {
    int age;
    int roll;
    String name;
    String branch;
    ToStringMethod(int age,int roll,String name,String branch){
        this.age=age;
        this.roll=roll;
        this.name=name;
        this.branch=branch;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", roll=" + roll + ", name=" + name + ", branch=" + branch + "]";
    }
    public static void main(String[] args) {
        ToStringMethod student=new ToStringMethod(20,26,"Chandni","IoT");
        System.out.println(student.toString());//toString by default exists in Object class
        System.out.println(student);//this gives same result as above
    }


}
