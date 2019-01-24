import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean repeat;
        int secret;
        int guess;
        
        secret = random.nextInt(100) + 1;
        System.out.println("Guess a number between 1 - 100: ");
        do {
            guess = input.nextInt();
            if (guess == 0) {
                System.out.println("All you had to do was follow the train.");
            }
            if (guess > secret) {
                System.out.println("Too damn high");
                System.out.println("Guess again");
            } else {
                if (guess < secret) {
                    System.out.println("Too low nerd.");
                    System.out.println("Guess again");
                }
            }
        } while (guess != secret);
        System.out.println("congratulation, you done it.");
        System.out.println(secret);
        System.out.println("Play again?: ");
    }
}
