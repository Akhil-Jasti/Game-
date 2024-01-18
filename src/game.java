import java.util.*;

public class game {
    // objects in class game
    private Scanner kin;
    private Player player;
    private GuessNumberGame guessNumberGame;
    private boolean running;
    private String option;

    //constructor
    game() {
        /*here we using this key word to refer object of current class and
        to remove confusion b/w class attributes and parameters with same name*/
        this.player = new Player();
        this.kin = new Scanner(System.in);
        this.guessNumberGame = new GuessNumberGame(50);
        this.running = true;
    }

    //function to display what options or functions does game have
    public void init() { // here we uses init method to insert or update data and to display
        while (running) {
            System.out.println("select an option: leave, play");
            System.out.print(">>> ");
            this.option = this.kin.next();

            //here we using ignore case to neglect the upper and lower case of user string input
            if (this.option.equalsIgnoreCase("leave")) {
                this.running = false; //as we used while loop if running is false program will end.

            } else if (option.equalsIgnoreCase("play")) {
                this.player.play(this.kin, this.guessNumberGame);
                this.guessNumberGame.setSecretNumber(50);

            } else {
                System.out.println("unknown option..Choose leave or play");
            }
        }
    }
}
