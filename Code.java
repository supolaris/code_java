import java.util.*;
import javax.swing.JOptionPane;

class Department{
    int departId;
    String departName;
    String departLoc;
}

public class Code{
    public static void main(String[] args) {
        try (Scanner keyboardInput = new Scanner(System.in)){
            System.out.println("The java program \t Class and Object");

            
            // class from other file
            Student student1 = new Student();
            student1.fName = "Muhammad";
            student1.lName = "Suleman";
            System.out.println(student1.fName + " " + student1.lName);


            // class inside same file
            Department depart1 = new Department();
            depart1.departId = 006;
            depart1.departName = "UIIT";
            System.out.println(depart1.departId + "\t" + depart1.departName);
        }
    }
}