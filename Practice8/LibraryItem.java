package Practice8;

public class LibraryItem {
     String itemId;
     String title;
     String author;
     boolean item=true;//item is available

    public void checkOut(){
       if(item){
        System.err.println("Your check out was successful");
        item=false;//item isn't available
       }
       else{
        System.err.println("This item is already checked out");
       }
    }
    public void returnItem(){
       if(!item){
        System.err.println("Item  returned successfully");
        item=true;
       }
       else{
        System.err.println("Return failed! This item didn't check out");
       }
    }
}
