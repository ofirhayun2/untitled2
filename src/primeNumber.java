import java.util.Scanner;
/*
A program that prints a certain amount of first numbers according to the number entered by the user.
*/
public class primeNumber {
    public static boolean restBetweenNumbers(int firstNumber, int num2) {
        return (firstNumber % num2 == 0);
    }
    public static boolean prime(int firstNumber) {
        for (int secondNumber = 2; secondNumber < firstNumber; secondNumber++) {
            if (restBetweenNumbers(firstNumber, secondNumber)) {
                return false;
            }
        }
        return true;
    }
    public static int number() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter a positive number:");
            number = scanner.nextInt();
        } while (number <= 1);
        return number;
    }

    public static void main(String[] args) {
        int number1 = number();
        for (int number2 = 2; number2 < number1; number2++) {
            boolean isPrime = prime(number2);
            if (isPrime) {
                System.out.println(number2);
            }
        }
    }
}


