import java.util.*;
import javax.swing.JOptionPane;



//class
class Student {
    String sName;
    int sId;
    String sDepartment;
    double scgpa;

    //constructor
    public Student(String ssName, int ssId, String ssDepartment, double sscgpa){
        this.sName = ssName;
        this.sId =  ssId;
        this.sDepartment = ssDepartment;
        this.scgpa = sscgpa;
    }

    //instance
    public boolean isHonorable () {
        if (this.scgpa > 3.5){
            return true;
        }
        else {
            return false;
        }
    }
}

public class Code{
    public static void main(String[] args) {
        try (Scanner keyboardInput = new Scanner(System.in)){
            System.out.println("The java program \t Constructor method");
            
            Student studen1 = new Student("Suleman", 627, "UIIT", 3.6);
            System.out.println(studen1.sName + " " + studen1.sId );
            System.out.println( "The student cgpa is greater then 3.5 " + studen1.isHonorable());
        }
    }
}