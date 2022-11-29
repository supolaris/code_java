import java.util.*;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
public class Code{
    public static void main(String[] args) {
        try (Scanner keyboardInput = new Scanner(System.in)){
            System.out.println("The java program");      
            File myFile = new File("C:dataFile.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch(Exception e){
            System.out.println("An error occured");
        }
    }
}