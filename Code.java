import java.util.Scanner;
public class Code{
    public static void main(String[] args) {
        try(Scanner keyboardInput = new Scanner(System.in)){
            String myWord = "Star";
            String guessWord = "";
            int guessLimit = 3;
            int guessCount = 0;
            boolean outofGuess = false;


            while (!guessWord.equals(myWord) && !outofGuess){
                if(guessCount < guessLimit){
                    System.out.print("Enter word: ");
                    guessWord = keyboardInput.nextLine();
                    guessCount ++ ;
                }
                else{
                    outofGuess = true;
                }
            }
            if(outofGuess){
                System.out.print("You are out of guess");
            }
            else{
                System.out.print("You win");
            }


            
            


        }
    }
}