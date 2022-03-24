import java.util.Random;
import java.util.Scanner;


class Game{

    int noOfGuessesAllowed;
    int randomNumber;

    public Game(int guessesToMake, int randomNumber){
        this.noOfGuessesAllowed = guessesToMake;
        this.randomNumber = randomNumber;
    }

    public void play(){
        Scanner sc = new Scanner(System.in);
        int guessedNumber;
        int guessesMade = 0;
        boolean guessed = false;

        while(noOfGuessesAllowed > guessesMade){
            System.out.println("Guess the number.." + (noOfGuessesAllowed-guessesMade) + " Chances left ! ");
            guessedNumber = sc.nextInt();

            if(guessedNumber > randomNumber){
                System.out.println("You should have guessed a little lower!");
            }
            else if(guessedNumber< randomNumber){
                System.out.println("You should have guessed a little higher!");
            }
            else{
                System.out.println("You have guessed it right.. The number is : " + randomNumber);
                guessed = true;
                break;
            }

            guessesMade += 1;

        }
        if(!guessed) {
            System.out.println("The number was : " + randomNumber);
            System.out.println("You are out of chances!!  Try again!! ");
        }

    }
}

public class practice_10_GuessTheNumber {

    public static void main(String[] args) {

        int randomNumber = new Random().nextInt(10);

        Game game = new Game(3, randomNumber);

        game.play();





    }
}
