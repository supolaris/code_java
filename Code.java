import java.util.*;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
public class Code{
    public static void main(String[] args) {
        try (Scanner keyboardInput = new Scanner(System.in)){
            File myFile = new File("C:dataFile.txt");
            if (myFile.createNewFile()){
                System.out.println("File name: " + myFile.getName());
            }
            else{
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            System.out.println("There is an error");
        }
    }
}