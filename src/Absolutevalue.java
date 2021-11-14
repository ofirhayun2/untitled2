import java.util.Scanner;
 /*
 Write a program that receives from the user a number, and prints on the screen its absolute value.
  */
public class Absolutevalue {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("chose a number: ");
        int wholeNumber = scanner.nextInt();
        if (wholeNumber > 0) {
            System.out.println("the value of is" + wholeNumber);
        } else {
            System.out.println(" the absolute value number " + wholeNumber * -1);
        }
    }
}
