import java.util.Random;
import java.util.Scanner;

public class practice_6_RPS {

    public static void main(String[] args) {

        int randomNumber = new Random().nextInt(3);

        System.out.println(randomNumber);

        String computer = "";
        String user = "";
        String result = "";

        if(randomNumber==0){
            computer = "ROCK";
        }
        else if(randomNumber==1){
            computer = "PAPER";
        }
        else if(randomNumber==2){
            computer = "SCISSOR";
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0->ROCK \n\t 1->PAPER \n\t 2->SCISSOR");
        int userNumber = sc.nextInt();

        if(userNumber==0){
            user = "ROCK";
        }
        else if(userNumber==1){
            user = "PAPER";
        }
        else if(userNumber==2){
            user = "SCISSOR";
        }
        else {
            System.out.println("Unexpected Input");
        }

        if(computer=="ROCK"  && user=="ROCK"){
            result = "Match Draw";
        }
        else if(computer=="ROCK"  && user=="PAPER"){
            result = "User won!!";
        }
        else if(computer=="ROCK"  && user=="SCISSOR"){
            result = "Computer won!!";
        }
        else if(computer=="PAPER"  && user=="ROCK"){
            result = "Computer won!!";
        }
        else if(computer=="PAPER"  && user=="PAPER"){
            result = "Match Draw";
        }
        else if(computer=="PAPER"  && user=="SCISSOR"){
            result = "User won!!";
        }
        else if(computer=="SCISSOR"  && user=="ROCK"){
            result = "User won!!";
        }
        else if(computer=="SCISSOR"  && user=="PAPER"){
            result = "Computer won!!";
        }
        else if(computer=="SCISSOR"  && user=="SCISSOR"){
            result = "Match Draw";
        }

        System.out.println("Computer chose: "+ computer);
        System.out.println("User chose: "+ user);
        System.out.println(result);


    }
}
