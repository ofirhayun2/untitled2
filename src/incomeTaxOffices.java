import java.util.Scanner;
/*
A program that sets an appointment by data entered by the user.
 */
public class incomeTaxOffices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which day would you like to come?");
        int day = scanner.nextInt();
        System.out.println("What's the earliest hour you can come?");
        int hourEarliest = scanner.nextInt();
        System.out.println("What's the latest hour you can come");
        int hourLatest = scanner.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 4:
            case 5: {
                if (hourEarliest < 0 || hourEarliest > 23 || hourLatest < 0 || hourLatest > 23) {
                    System.out.println("wrong");
                    break;
                }
                if (hourEarliest < 9 && hourEarliest > 0 || hourLatest < 23 && hourLatest > 17) {
                    System.out.println("Please enter hours in the range: 9:00-17:00");
                    break;
                }
                if (hourEarliest > hourLatest) {
                    System.out.println("wrong");
                    break;
                }
            }
            System.out.println("your Appointment is regestet");
break;
            case 3: {
                if (hourEarliest < 0 || hourEarliest > 23 || hourLatest < 0 || hourLatest > 23 ) {
                    System.out.println("wrong");

                    break;
                }
                if (hourEarliest < 8 && hourEarliest > 0 || hourLatest < 23 && hourLatest > 12 ) {
                    System.out.println("Please enter hours in the range: 8:00-12:00");
                    break;
                }
                if (hourEarliest > hourLatest) {
                    System.out.println("wrong");
                    break;
                }
                System.out.println("your Appointment is regestet");
            }
break;
            case 6:
            case 7: {
                System.out.println("the office is close");
                break;
            }
            default: {
                System.out.println("the day you have chosen not exist");
                break;
            }
        }
    }

}
