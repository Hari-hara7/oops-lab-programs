package oopslab;

import java.util.Random;
import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(Integer.MAX_VALUE) + 1;

        Scanner scanner = new Scanner(System.in);
        int guess = 0;

        System.out.println("Welcome to the 'Guess My Number' game!");
        System.out.println("I'm thinking of a number between 1 and " + Integer.MAX_VALUE);

        while (guess != randomNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number!");
            }
        }

        scanner.close();
    }
}
