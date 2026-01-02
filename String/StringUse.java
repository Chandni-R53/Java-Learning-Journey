package String;

public class StringUse {
    public static void main(String[] args) {
        int age=34;
        String name="Elsa";
        System.out.println("Hello "+name+", you are "+age+" years old");//use more memory
        System.out.printf("Hello %s, you are %d years old",name,age);//efficient string formatting
        //stringBuilder
        StringBuilder sb=new StringBuilder("\nGood Morning,");
        sb.append(" today you're looking very pretty!");
        sb.append(" And you know what your dress looks fabulous too");
        System.out.println(sb.toString());
        System.out.println(sb);
    }
}
