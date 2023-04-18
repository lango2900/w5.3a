import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {

        try {
       File file = new File("test_file.txt");

       if(!file.exists()) {

       file.createNewFile();
       System.out.println("File created.");
       } else {
           System.out.println("File already exists.");
       }

        }  catch(IOException e) {
            e.printStackTrace();
        }
    }
}