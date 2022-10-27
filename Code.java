import java.util.*;
import javax.swing.JOptionPane;
public class Code{
    public static void main(String[] args) {
        try (Scanner keyboardInput = new Scanner(System.in)){
            System.out.println("The java program \t Guessing game");
            String myWord = "supolaris";
            String guessWord = "";
            int guessCount  = 0;
            int guessLimit = 3;
            boolean outofGuess = false;

            while (!myWord.equals(guessWord) && !outofGuess){
                if (guessCount < guessLimit){
                    System.out.print("Enter the guess Word: ");
                    guessWord = keyboardInput.nextLine();
                    guessCount++ ;
                }
                else{
                    outofGuess = true;   
                }  

            }
            if (outofGuess){
                System.out.println("You are out of guess!");
            }
            else{
                System.out.println("You win");   
            }
            
    }
}
}
