package CodeSoft;

import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int key = rand.nextInt(100);
        int guess;
        int attempts = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;
            if (guess<key) {
                System.out.println("your guess is lower");
            } else if (guess>key) {
                System.out.println("your guess is higher");
            } else {
                System.out.println("You guessed the number!! : "+key);
                System.out.println("It took you " + attempts + " attempts.");
            }
        } while (guess!=key);
        sc.close();
    }
}