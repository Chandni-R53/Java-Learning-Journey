package Practice6;

public class ImmutableClass {
    final String name;
    final int age;
    final int roll;
    final float score;

    ImmutableClass(String name,int age,int roll,float score){
      this.name=name;
      this.age=age;
      this.roll=roll;
      this.score=score;
      //this.score++;
      //score value can not be changed once initialised bcoz of final keyword
    }
}
