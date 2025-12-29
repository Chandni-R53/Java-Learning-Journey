package ClassAndObject;

public class Course {
    static int maxCapacity;
    String courseName;
    int enrolledStudents;
    boolean isEnrolled;
    static{
        maxCapacity=100;
    }
    Course(String courseName,int enrolledStudents){
        this.courseName=courseName;
        this.enrolledStudents=enrolledStudents;
    }
    Course(int enrolledStudents){
        this("unknown",enrolledStudents);
    }
    public static void setMaxCapacity(int capacity){
        maxCapacity=capacity;
    }
    public void enrollStudent(String studentName){
        if(isEnrolled){
            System.out.println(studentName+" is already enrolled");
        }
        else{
            System.out.println(studentName+" is enrolled successfully");
            isEnrolled=true;
        }
    }
    public void unenrollStudent(String studentName){
        if(isEnrolled){
            System.out.println(studentName+" is unenrolled successfully");
            isEnrolled=false;
        }
        else{
            System.out.println(studentName+" is not enrolled in any course");
        }
    }
    public static void main(String[] args) {
        Course c1=new Course("Data Analytics",78);
        Course c2=new Course(60);
        System.out.println("Max. no. of students for "+c1.courseName+" is "+Course.maxCapacity);
        System.out.println("Max. no. of students for "+c2.courseName+" is "+Course.maxCapacity);
        Course.setMaxCapacity(250);
        System.out.println("Max. no. of students for "+c1.courseName+" is "+Course.maxCapacity);
        c1.enrollStudent("Chandni Rajawat");
        c2.enrollStudent("Gaurav Pandey");
        c2.unenrollStudent("Gaurav Pandey");
        c1.enrollStudent("Chandni Rajawat");
    }

}
