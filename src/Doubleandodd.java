import java.util.Scanner;
    /*
    This program picks up two numbers from the user, and prints on the screen whether they are even or odd.
     */
    public class Doubleandodd {
        public static void main(String [] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("chose the first number: ");
            int firstNumber = scanner.nextInt();
            System.out.println("chose the second number: ");
            int secondNumber = scanner.nextInt();
            int sum = firstNumber + secondNumber;
            if (sum % 2 ==0) {
                System.out.println("the result is a double number " + sum );
            } else {
                System.out.println("the result is a no double number" + sum );

            }

        }


    }


