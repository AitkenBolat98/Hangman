import java.util.Scanner;

public class Game {
    int numberOfLives = 6;
    HangmanDrawing hangmanDrawing = new HangmanDrawing();
    Scanner scanner = new Scanner(System.in);
    public void playGame(String correctWord){
        while(numberOfLives > -1){
            hangmanDrawing.drawCurrentHangman(numberOfLives);
            System.out.println("Current number of lives is " + numberOfLives);
            if(numberOfLives == 0){
                System.out.println("U lost");
                break;
            }else {
                System.out.println("Make a guess");
                String chosenWord = scanner.nextLine();
                if (chosenWord.equals(correctWord)) {
                    System.out.println("U won");
                    break;
                } else {
                    numberOfLives--;
                }
            }
        }
    }
}
