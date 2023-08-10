import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File dictionary = new File("C:\\Users\\aitke\\OneDrive\\Desktop\\Hangman.txt");
        Dictionary newDictionary = new Dictionary();
        String correctWord = newDictionary.wordForPlay(dictionary);
        Game game = new Game();
        System.out.println(correctWord);
        game.playGame(correctWord);

    }

    }

