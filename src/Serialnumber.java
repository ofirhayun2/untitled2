    import java.util.Scanner;
    /*
    Write a program that receives in order from the users numbers and prints.
     */
    public class Serialnumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter a number:");
            int number1 = scanner.nextInt();
            System.out.println("enter a number:");
            int number2 = scanner.nextInt();
            System.out.println("enter a number:");
            int number3 = scanner.nextInt();

            if (number1 > number2 && number1 > number3 && number2 > number3) {
                System.out.println(" the serial is:   " + number1 + number2 + number3);
            }
            if (number1 > number3 && number1 > number2 && number3 > number2) {
                System.out.println( "the serial is: " +number1 + number3 + number2);
            }
            if (number2 > number1 && number2 > number3 && number1 > number3) {
                System.out.println("the serial is:  " +number2 + number1 + number3);
            }
            if (number2 > number3 && number2 > number1 && number3 > number1) {
                System.out.println(" the serial is:  "+number2 + number3 + number1);
            }
            if (number3 > number1 && number3 > number2 && number1 > number2){
                System.out.println(" the serial is: " + number3 + number1 + number2);
            }
            if (number3 > number2 && number3 > number1 && number2 > number1)
                System.out.println( " the serial is:  " +number3 + number2 + number1 );
        }
    }

