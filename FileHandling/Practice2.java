package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Practice2 {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String fileName=sc.nextLine();
        try(FileWriter writer=new FileWriter(fileName)){
            System.out.print("Start writing in file: ");
            String fileContent=sc.nextLine();
            writer.write(fileContent);
            writer.flush();
            System.out.println("Your file is written successfully!");
        }catch(IOException e){
             System.out.printf("Exception occurred: %s",e.getMessage());
        }


    }


}
