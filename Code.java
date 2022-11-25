import java.util.Scanner;

    //class
        class Student{
        String sName;
        int sRoll;
        Double sGpa;
        private String sDepartment;
    
    //constructor
    public Student(String ssName, int ssRoll, Double ssGpa, String ssDepartment){
        this.sName = ssName;
        this.sRoll = ssRoll;
        this. sGpa = ssGpa;
        this.sDepartment = ssDepartment;
    }
    
    //instance
    boolean isMerit(){
        if(this.sGpa > 3.3){
            return true;
        }
        else{
            return false;
        }
    }

    public void setsDepartment(String setterDepart){
        if (setterDepart.equals("UIIT") || setterDepart.equals("Business")){
            this.sDepartment = setterDepart;
        }
        else{
            this.sDepartment = "unknown";
        }
    }    

    }

public class Code{
    public static void main(String[] args) {
        try (Scanner keyboardInput = new Scanner(System.in)){
            System.out.println("Code of Setters & Getters");
            Student student1 = new Student("Suleman", 627, 3.4, "Uiit");
            Student student2 = new Student("James", 007, 3.0, "Business");

            student1.setsDepartment("aaa");

            System.out.println("INFORMATION OF STUDENT");
            System.out.println("==========================");
            System.out.println("Name : " + student1.sName + " GPA: " + student1.sGpa + " Roll number: " + student1.sRoll + " Department: " + student1.sDepartment);
            System.out.println("Is cgpa is greater than 3.3: " + student1.isMerit());
            System.out.println("Name : " + student2.sName + " GPA: " + student2.sGpa + " Roll number: " + student2.sRoll);
            System.out.println("Is cgpa is greater than 3.3: " + student2.isMerit());
 

        }
    }
}