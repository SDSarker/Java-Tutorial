import java.util.Random;
import java.util.Scanner;

class Game{
    int number;
    int guessno=0;
    int givennum;
    Game(){
        Random r=new Random();
        this.number=r.nextInt(100);
        
    }

    void takeUserInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Guess no : "+guessno);
        System.out.println("Guess the number:");
        givennum= sc.nextInt();
    }

    boolean isCorrectNumber(){
        guessno++;
        if(givennum==number) {
            System.out.println("You have guessed the correct ans with "+guessno+" attempt");
            return true;
        }
        else if(givennum>number){
            System.out.println("Guess a lower number");
            return false;
        }
        else{
            System.out.println("Guess a higher number");
            return false;
        }
    }
}

public class GuessTheNumber {

//    Create a class Game, which allows a user to play "Guess the Number" game once.
//
//    Game should have the following methods:
//    Constructor to generate the random number
//    takeUserInput() to take a user input of number
//    isCorrectNumber() to detect whether the number entered by the user is true
//    getter and setter for noOfGuesses
//    Use properties such as noOfGuesses(int), etc to get this task done!

    public static void main(String[] str){
        Game g=new Game();
        boolean flag=false;

        while(!flag){
            g.takeUserInput();
            flag = g.isCorrectNumber();
        }

    }
}




