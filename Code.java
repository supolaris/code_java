import java.util.*;
import javax.swing.JOptionPane;
public class Code{
    public static void main(String[] args) {
        try (Scanner keyboardInput = new Scanner(System.in)){
            System.out.println("The java program of calculator");
            System.out.print("Enter number 1: ");
            int num1 = keyboardInput.nextInt();
            System.out.print("Enter number 2: ");
            int num2 = keyboardInput.nextInt();
            System.out.print("Enter the operatio: ");
            String operator = keyboardInput.next();

            if (operator.equals("+")){
                System.out.println("The sum of " + num1 + " + " + num2 + " is " + num1 + num2);
            }
            else if (operator.equals("-")){
                System.out.println(num1 - num2);
            }
            else if (operator.equals("*")){
                System.out.println("The multiplication of " + num1 + " and " + num2 + " is " + num1 * num2);
            }
            else{
                System.out.print("Invalid operator");
            }

        }
    }
}