import java.util.Scanner;
/*
The program programs a secret number between 1 and 1000. The two users need to guess, each in turn what the number.
The winner is the user who managed to guess the secret number.
 */
public class randomNumber {
    public static void main(String[] args){
        int secretNumber = randomNumber1();
        numberChecker(secretNumber);
    }
    public static int randomNumber1(){
        return ((int) (Math.random() * (1000-1))+1);
    }
    public static void numberChecker(int lotteryScore){
        Scanner number = new Scanner(System.in);
        int participant1;
        int participant2;
        int roundNumber = 0;
        do {
            System.out.println("Participant num 1 enter a number: ");
            participant1 = number.nextInt();
            roundNumber = roundNumber +1;
            if (participant1 == lotteryScore){
                break;
            }
            else if (participant1 > lotteryScore){
                System.out.println("the number you have chosen is bigger than the secret number");
            }
            else {
                System.out.println("the number you have chosen is smaller than the secret number");
            }
            System.out.println("participant num 2 enter a number: ");
            participant2= number.nextInt();
            if (participant2 == lotteryScore){
                break;
            }
            else if (participant2 > lotteryScore){
                System.out.println("the number you have chosen is bigger than the secret number");
            }
            else {
                System.out.println("the number you have chosen is smaller than the secret number");
            }
        }while (lotteryScore != participant2);
        if (lotteryScore == participant1){
            System.out.println("participant num 1 have won after " + roundNumber +" rounds");
        }
        else {
            System.out.println(" participant num 2  have won after " + roundNumber +" rounds");
        }

    }
}


