package Polymorphism;
 class Check {
     int value;
    
}

public class CheckPassBy {
    
    //pass by vlaue
    public void change(int x){
        x++;
    }
     //pass by ref.
    public void change2(Check obj){
        obj.value=10;
    }


    public static void main(String[] args) {
        int a=8;
        System.out.println(a);
        CheckPassBy ob=new CheckPassBy();
        ob.change(a);
        System.out.println(a);
        Check object=new Check();
        object.value=5;
        System.out.println(object.value);
        ob.change2(object);
        System.out.println(object.value);
        
    }
}
