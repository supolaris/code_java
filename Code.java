import java.util.Scanner;

    //class
        class Student{
        private String sName;
        private int sRoll;
        private Double sGpa;
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

    //setter for department variable
    public void setsDepartment(String setterDepart){
        if (setterDepart.equals("UIIT") || setterDepart.equals("Business")){
            this.sDepartment = setterDepart;
        }
        else{
            this.sDepartment = "unknown";
        }
    }  
    public String getsDepartment(){
        return sDepartment;
    }  

    //setter for name variable
    public void setsName(String ssName){
        this.sName = ssName;
    }
    public String getName(){
        return sName;
    }

    //setter for rollno variable
    public void setRoll(int ssroll){
        this.sRoll = ssroll;
    }
    public int getRoll(){
        return sRoll;
    }

    //setter for gpa
    public void setGpa(Double ssgpa){
        this.sGpa = ssgpa;
    }
    public Double getGpa(){
        return sGpa;
    }



    }

public class Code{
    public static void main(String[] args) {
        try (Scanner keyboardInput = new Scanner(System.in)){
            System.out.println("Code of Setters & Getters");
            
            Student student1 = new Student("Suleman", 627, 3.4, "Uiit");
            Student student2 = new Student("James", 007, 3.0, "Business");


            student1.setsDepartment("new department");

            

            System.out.println("INFORMATION OF STUDENT");
            System.out.println("==========================");
            System.out.println("Name : " + student1.getName() + " GPA: " + student1.getGpa() + " Roll number: " + student1.getRoll() + " Department: " + student1.getsDepartment());
            System.out.println("Is cgpa is greater than 3.3: " + student1.isMerit());
            System.out.println("Name : " + student2.getName() + " GPA: " + student2.getGpa() + " Roll number: " + student2.getRoll());
            System.out.println("Is cgpa is greater than 3.3: " + student2.isMerit());
 

        }
    }
}