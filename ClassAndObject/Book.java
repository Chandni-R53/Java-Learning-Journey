package ClassAndObject;

public class Book {
    static int totalBooks;
    String title;
    String author;
    int isbn; //unique id of book
    boolean isBorrowed;
    
    //static block
    static{
        totalBooks=0;
    }
    //initialization block
    {
        totalBooks++;
        //isBorrowed=false;
    }
    
    //Constructors
    Book(String title,String author,int isbn){
      this.title=title;
      this.author=author;
      this.isbn=isbn;
    }
    Book(int isbn){
        this("unknown","unknown",isbn);
    }

    //static method
    public static int getTotalBooks(){
        return totalBooks;
    }
    //non-static methods
    public void borrowBook(){
      if(isBorrowed){
       System.out.println("The book is already borrowed");
      }
      else
       {System.out.println("The book is borrowed to you");
        isBorrowed=true;
      }
    }
    public void returnBook(){
      if(isBorrowed){
       System.out.println("The book is returned now, thankyou!");
        isBorrowed=false;
    }
      else
       {System.out.println("The book is not borrowed");}
    }
    

    public static void main(String[] args) {
        Book b1=new Book("Atomic Habit","James Clear",1);
        Book b2=new Book(2);
        System.out.println("Total books = "+Book.getTotalBooks());
        b1.borrowBook();
        b2.borrowBook();
        b1.returnBook();
        b1.returnBook();
    }

    
}
