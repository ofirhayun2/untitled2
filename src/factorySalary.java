import java.util.Scanner;
/*
A program that calculation salary of two types of factory workers.
 */
public class factorySalary {
    public static void main(String[] args) {
        int end;
       do {
           Scanner scanner = new Scanner(System.in);
           System.out.println("which worker is it?. for a senior employee select-1/t for a junior employee select-0; ");
           int worker = scanner.nextInt();
           System.out.println("how many hours?");
           int hour = scanner.nextInt();
           System.out.println("how many days he reached his daysGoal");
           int daysGoal = scanner.nextInt();
           System.out.println("the salary for the day is :" + factorySalary1(worker, hour, daysGoal));
           System.out.println("do you want to stop? 1 for no or 0 for yes");
           end = scanner.nextInt();
       } while (end==0);
    }

    public static int factorySalary1(int worker, int hour, int daysGoal) {
        int salary;
        if (worker == 0) {
             salary = (hour * 50) + (250 * daysGoal);
        }
        else {
             salary = (hour * 200) + (250 * daysGoal);

        } return salary;

    }}












