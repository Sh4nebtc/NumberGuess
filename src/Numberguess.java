import java.util.Scanner;
public class Numberguess {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int guessingnumber = (int)(Math.random() * 100) + 1;

        int Attempts = 10;

        while (Attempts > 0) {

            System.out.print("Guess a number between 1 and 100: ");
            int guess = scanner.nextInt();

            if (guess == guessingnumber) {
                System.out.println("Congrats You guessed the number correctly");
                break;
            } else if (guess < guessingnumber) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }

            Attempts--;
        }

        if (Attempts == 0) {
            System.out.println("You lost! The secret number was " + guessingnumber);
        } else {
            System.out.println("You won! You guessed the number in " + Attempts + " attempts.");
        }

        System.out.print("would you like to play again? (Y for yes /N for no): ");
        String playAgain = scanner.next();

        if (playAgain.equals("Y")) {
            main(args);
        }
    }
}