import java.util.Random;
import java.util.Scanner;
public class guessgame{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int maxatmpt=3;
        boolean playagain=true;
        int roundsWon = 0;
        int totalAttempts = 0;

        while(playagain){
            int result = r.nextInt(100 - 1) + 1;
            int atmpt=0;
            boolean correctguess=false;
            System.out.println("You will get three(3) tries to guess the correct random number.");
            while(atmpt < maxatmpt && !correctguess){
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                atmpt++;
                totalAttempts++;
                if (guess < result) {
                    System.out.println("Too low!");
                } else if (guess > result) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Congratulations! You guessed the correct number in " + atmpt + " attempts.");
                    correctguess = true;
                    roundsWon++;
                }
            }
            if (!correctguess) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + result);
            }
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            playagain = response.equalsIgnoreCase("yes");
        }
        System.out.println("Game Over! You won " + roundsWon + " rounds and made a total of " + totalAttempts + " attempts.");
        scanner.close();
    }
}