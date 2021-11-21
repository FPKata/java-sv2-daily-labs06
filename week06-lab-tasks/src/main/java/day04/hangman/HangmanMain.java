package day04.hangman;

import java.util.Scanner;

public class HangmanMain {

    private String wordToFind = "kismacska";
    private String wordFound = "_".repeat(wordToFind.length());
    private int chances = 8;

    private void run(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Itt tartasz: " + wordFound);
            System.out.println("Ennyi tipped van: " + chances);
            System.out.println("Mi a következő tipped?");
            String guess = scanner.nextLine();

            if (wordToFind.contains(guess)){
                System.out.println("Jó.");
                wordFound = updateWordFound(wordToFind, wordFound, guess);
            }else{
                System.out.println("Rossz.");
                chances--;
            }
        }while(!wordToFind.equals(wordFound) && chances > 0);

        if (wordToFind.equals(wordFound)){
            System.out.println(wordFound);
            System.out.println("Kitaláltad, ügyes vagy!");
        }else{
            System.out.println("Vesztettel...");
        }
    }

    private String updateWordFound(String wordToFind, String status, String guess) {
        char[] chars = status.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (wordToFind.charAt(i) == guess.charAt(0)) {
                chars[i] = guess.charAt(0);
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        HangmanMain hangmanmain = new HangmanMain();
        hangmanmain.run();  //new HangmanMain().run();
    }
}
