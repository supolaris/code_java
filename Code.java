import java.util.*;
import javax.swing.JOptionPane;

class Student {
    String sName;
    int sId;
    String sDepartment;

    public Student(String ssName, int ssId, String ssDepartment){
        this.sName = ssName;
        this.sId =  ssId;
        this.sDepartment = ssDepartment;
    }
}

public class Code{
    public static void main(String[] args) {
        try (Scanner keyboardInput = new Scanner(System.in)){
            System.out.println("The java program \t Constructor method");
            
            Student studen1 = new Student("Suleman", 627, "UIIT");
            System.out.println(studen1.sName + " " + studen1.sId );
        }
    }
}