package company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame {
    private List<String> wordList;
    private String selectedWord;
    private StringBuilder guessedLetters;
    private List<Character> wrongGuesses;

    public HangmanGame() {
        wordList = new ArrayList<>();
        wordList.add("apple");
        wordList.add("banana");
        wordList.add("orange");
        wordList.add("strawberry");
        wordList.add("kiwi");

        guessedLetters = new StringBuilder();
        wrongGuesses = new ArrayList<>();
    }

    public void startGame() {
        selectRandomWord();
        int maxWrongGuesses = 6;
        int wrongGuessCount = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Guess a letter: ");
            char guessedLetter = scanner.next().toLowerCase().charAt(0);

            if (selectedWord.contains(String.valueOf(guessedLetter))) {
                guessedLetters.append(guessedLetter);
                if (checkIfWon()) {
                    System.out.println("Congratulations! You won!");
                    System.out.println("The word was: " + selectedWord);
                    break;
                }
            } else {
                wrongGuesses.add(guessedLetter);
                wrongGuessCount++;
                System.out.println("Wrong guess!");

                if (wrongGuessCount >= maxWrongGuesses) {
                    System.out.println("Game over! You lost.");
                    System.out.println("The correct word was: " + selectedWord);
                    break;
                }
            }

            displayWordProgress();
            displayWrongGuesses();
        }

        System.out.println("Do you want to play again? (yes/no)");
        String playAgain = scanner.next().toLowerCase();

        if (playAgain.equals("yes")) {
            resetGame();
            startGame();
        } else {
            System.out.println("Thank you for playing!");
        }
    }

    private void selectRandomWord() {
        Random random = new Random();
        int index = random.nextInt(wordList.size());
        selectedWord = wordList.get(index);
    }

    private void displayWordProgress() {
        StringBuilder progress = new StringBuilder();

        for (char c : selectedWord.toCharArray()) {
            if (guessedLetters.toString().contains(String.valueOf(c))) {
                progress.append(c).append(" ");
            } else {
                progress.append("_ ");
            }
        }

        System.out.println(progress);
    }

    private void displayWrongGuesses() {
        System.out.println("Wrong guesses: " + wrongGuesses);
    }

    private boolean checkIfWon() {
        for (char c : selectedWord.toCharArray()) {
            if (!guessedLetters.toString().contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }

    private void resetGame() {
        guessedLetters.setLength(0);
        wrongGuesses.clear();
    }

    public static void main(String[] args) {
        HangmanGame hangmanGame = new HangmanGame();
        hangmanGame.startGame();
    }
}
