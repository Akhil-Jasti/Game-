import java.util.Random;

public class GuessNumberGame {
    // here we used private keyword to offer strong encapsulation by accessing in only its own class.
    private int secretNumber;
    private Random random;

    GuessNumberGame(int limit) { //constructor
        this.random = new Random();
        this.setSecretNumber(limit);
    }
    public void setSecretNumber(int limit) {
        this.secretNumber = this.random.nextInt(limit);
    }
     /* here we used set ang get methods to protect data when creating classes and
      to get data from one class to another*/
    public int getSecretNumber() {
        return this.secretNumber;
    }
}
