import java.util.Scanner;
import java.util.Random;

public class Guesser {
    private Scanner input;

    public Guesser() {
        input = new Scanner(System.in);
    }//End public Guesser

    public static void main(String[] args) {
        Guesser game = new Guesser();
        game.run();
    }//End public static void main String args

    public void run() {
        int choice;
        do {
            System.out.println("\n===============================");
            System.out.println(" Number Guesser Game ");
            System.out.println("===============================");
            System.out.println("0) Exit");
            System.out.println("1) Human Guesser");
            System.out.println("2) Computer Guesser");
            System.out.print("Please enter 0-2: ");

            while (!input.hasNextInt()) {
                System.out.print("Invalid input. Please enter 0, 1, or 2: ");
                input.next();
            }//End while

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    humanGuesser();
                    break;

                case 2:
                    computerGuesser();
                    break;

                case 0:
                    System.out.println("Thanks for playing!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }//End switch

        } while (choice != 0); //End do

    }//End public void run

    private void humanGuesser() {
        Random rand = new Random();
        int target = rand.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("\nHuman Guesser Mode!");
        while (true) {
            System.out.print((attempts + 1) + ") Please enter a number: ");

            while (!input.hasNextInt()) {
                System.out.print("That's not a number. Try again: ");
                input.next();
            }//End while

            guess = input.nextInt();
            input.nextLine(); // clear buffer
            attempts++;

            if (guess < target) {
                System.out.println("too low...");

            } else if (guess > target) {
                System.out.println("too high...");

            } else {
                System.out.println("got it!");
                System.out.println("Very good! You took " + attempts + " attempts.");
                break;
            }//End if else if else

        }//End while

    }//End priavte void humanGuesser

    private void computerGuesser() {
        System.out.println("\nComputer Guesser Mode!");
        System.out.println("Think of a number between 1 and 100...");

        int low = 1;
        int high = 100;
        int guess;
        int attempts = 0;
        String response;

        while (true) {
            guess = (low + high) / 2;
            attempts++;
            System.out.print(attempts + ") I guess " + guess + "\nToo (H)igh, too (L)ow, or (C)orrect? ");
            response = input.nextLine().trim().toLowerCase();

            if (response.equals("h")) {
                high = guess - 1;

            } else if (response.equals("l")) {
                low = guess + 1;

            } else if (response.equals("c")) {
                System.out.println("Yay! I guessed your number in " + attempts + " tries!");
                break;

            } else {
                System.out.println("Please enter only H, L, or C.");
            }//End if else else if

            if (low > high) {
                System.out.println("Hmm... something went wrong. Did you change your number?");
                break;
            }//End if

        }//End while

    }//End private void computerGuesser

}//End public class Guesser

