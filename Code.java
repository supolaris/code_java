import java.util.*;
import javax.swing.JOptionPane;
public class Code{
    public static void main(String[] args) {
        try (Scanner keyboardInput = new Scanner(System.in)){
            System.out.println("The java program of switchs");    
            System.out.print("Enter car ranking number7: ");
            int numb = keyboardInput.nextInt();
            
            
            System.out.print(sayHi(numb));
        }
    }


    public static String sayHi(int carNum){
        String carName = "";
        switch(carNum){
            case 0: carName = "Ford F-Series";
            break;
            case 1: carName = "Chevrolet Silverado";
            break;
            case 2: carName = "Ram 1500/2500/3500";
            break;
            case 3: carName = "Toyota RAV4";
            break;
            case 4: carName = "Honda CR-V";
            default:
            carName= "Error invalid number";
            
        }
        return carName;
    }
}