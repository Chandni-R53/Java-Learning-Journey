package Practice8;

public class Test {
    public static void main(String[] args) {
        Book b=new Book();
        Magazine m=new Magazine();
        DVD d=new DVD();
        b.ISBN="bk34";
        b.title="Golden Rules";
        b.author="Adam ex";
        d.duration=3;
        m.issueNumber=30;

        b.checkOut();
        b.returnItem();
        m.returnItem();



    }
}
