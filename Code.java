import java.util.Scanner;;
class Student{
    private String sName;
    private String sDepartment;
    private int sRoll;



    public Student(String sName, String sDepartment, int sRoll){
        this.sName = sName;
        this.sDepartment = sDepartment;
        this.sRoll = sRoll;
    }



    public void setsName(String ssName){
        this.sName = ssName;
    }
    public String getsName(){
        return sName;
    }

    public void setsDepartment(String ssDepartment){
        this.sDepartment = ssDepartment;
    }
    public String getsDepartment(){
        return sDepartment;
    }

    public void setsRoll(int ssRoll){
        this.sRoll = ssRoll;
    }
    public int getsRoll(){
        return sRoll;
    }



}

public class Code{
    public static void main(String[] args) {
        try (Scanner keyboardInput = new Scanner(System.in)){
            // String input = keyboardInput.nextLine();
             
            Student student1 = new Student("james", "movie", 007);
            System.out.print("Enter user name: ");
            student1.setsName(keyboardInput.nextLine());
            // student1.sName = keyboardInput.nextLine();
            System.out.println("The user name is: " + student1.getsName());
        }
        
    }
}