import java.util.Scanner;
/*
A program that prints a number of asterisks by a data entered by the user.
 */

public class Asterisk {
    public static void main(String[] args) {
        int num =rangeNumber();
        printAsterisk(num);
    }
    public static int rangeNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("please enter a number");
            number = scanner.nextInt();
        } while (number < 5 || number > 20);
        return number;
}
    public static void printAsterisk(int result) {
        String asterisk = "*";
        for (int i = 0; i < result; i++) {
            System.out.println(asterisk);
            asterisk = asterisk + "*";
        }
    }
}





