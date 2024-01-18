import java.util.Scanner;

public class Player {
    public void play(Scanner kin, GuessNumberGame game) {
        int tries = 5; // no of tries fixed to 5
        int UserNumber = 0; // initially user input number taken as 0

        for (int i = 0; i < tries; i++) {
            System.out.print("guess number: ");
            UserNumber = Integer.parseInt(kin.next()); // here we changed user input by reading run time input
            if (UserNumber > game.getSecretNumber()) {
                System.out.println("secret number is lower");
            } else if (UserNumber < game.getSecretNumber()) {
                System.out.println("secret number is higher");
            } else {
                break;
            }
        }
        if (UserNumber == game.getSecretNumber()) {
            System.out.println("Hurray you WIN");
            System.out.println("Do you want to play again??");
        }
        if (tries == 5 && UserNumber != game.getSecretNumber()) {
            System.out.println("Sorry, you done with your attempts..wanna try again??");
        }
    }
}
