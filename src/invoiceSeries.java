import java.util.Scanner;
/*
A program that prints an invoice series with a fixed difference between each and every number.
 */

public class invoiceSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        float firstNumber = scanner.nextInt();

        System.out.println("enter distance");
        float distance = scanner.nextInt();

        System.out.println("enter the howManyNum ");
        float howManyNumber = scanner.nextInt();
        int howManyNumInt = (int)howManyNumber;

        if ( howManyNumber > 0 && howManyNumInt == howManyNumber) {
            invoiceSeriesMain(firstNumber, distance, howManyNumInt);
        }
        else {
            System.out.println("enter a natural number");
        }
    }
    public static void invoiceSeriesMain(float firstNumber, float distance, int howManyNumInt) {
        float cuurentTerm = firstNumber;
        System.out.println(firstNumber);

        for (int i = 0; i < (howManyNumInt - 1); i++) {
            cuurentTerm = cuurentTerm + distance;
            System.out.println(cuurentTerm);
        }
    }
}




