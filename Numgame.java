import java.util.*;

public class Numgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Complete_Rounds = 4;
        int Max_Attempts = 4;
        int Score = 0;
        System.out.println("Start Number Game");
        System.out.println("Guess the number between 1 to 100");

        for (int round = 1; round <= Complete_Rounds; round++) {

            int attempts = 0;
            boolean Right_Guess = false;

            Random rn = new Random();
            int random_num = rn.nextInt(100);

            System.out.println("Round : " + round + " of " + Complete_Rounds);

            while (attempts < Max_Attempts && !Right_Guess) {

                System.out.println("Enter Your Guess: ");

                int guess = sc.nextInt();
                attempts++;

                if (guess < random_num) {
                    System.out.println("Guess is low");
                    System.out.println("Try Again!");
                } else if (guess > random_num) {
                    System.out.println("Guess is high");
                    System.out.println("Try Again!");
                } else {
                    System.out.println("Congratulation Guess is Correct");
                    Right_Guess = true;
                    Score++;
                }
            }
            if (!Right_Guess) {
                System.out.println("You have used all : " + Max_Attempts + " attempts");
                System.out.println("The Correct Answer is: " + random_num);

            }

        }
        System.out.println("Game Over!");
        System.out.println("Your Score : " + Score);
        sc.close();
    }
}