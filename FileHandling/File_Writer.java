package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class File_Writer {
    public static void main(String[] args) {
        String fileName="JavaLearning.txt";
        
        try(FileWriter writer=new FileWriter(fileName)){
            writer.write("Hello, I'm learning Java");
            writer.flush();
            System.out.println("File is written successfully!");
            
        }catch(IOException e){
            System.out.printf("Exception occurred: %s",e.getMessage());
        }
    }
}
