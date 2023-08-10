import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Dictionary {
        public String wordForPlay(File dictionary) throws FileNotFoundException {
                Scanner scanner = new Scanner(dictionary);
                ArrayList<String> correctWords = new ArrayList<>();
                Random randomNumber = new Random();
                String chosenWord;
                while(scanner.hasNextLine()){
                        String currentWord = scanner.nextLine();
                        if(currentWord.length() < 6){
                                continue;
                        }else{
                                correctWords.add(currentWord);
                        }
        }

                chosenWord = correctWords.get(randomNumber.nextInt(correctWords.size() - 1));
                return chosenWord;
        }
}

