package FileHandling;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String fileName=sc.nextLine();
        try(FileReader reader=new FileReader(fileName)){
            int read=0;
            do{
                read=reader.read();
                System.out.print((char)read);
            }while(read!=-1);

        }catch(FileNotFoundException e){
           System.out.printf("%s file not found",fileName);
        }catch(IOException e){
             System.out.printf("Exception occurred: %s",e.getMessage());
        }

        
    }
}vbbbnv
