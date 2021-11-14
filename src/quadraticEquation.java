import java.util.Scanner;
/*
A program for a quadratic equation,the user will be entering values for variables.
There are three different types of solutions: equation with two solutions, with one solution and without solution.
 */
public class quadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        double a = scanner.nextInt();
        System.out.println("enter b number");
        double b = scanner.nextInt();
        System.out.println("enter c");
        double c = scanner.nextInt();
        double sqrt = (b * b) - 4 * a * c;
        double root = Math.sqrt(sqrt);
        double result1 = (-b + root) /2*a;
        double result2 = (-b - root) / 2*a;


        if (sqrt < 0) {
            System.out.println("no answer");
        }
        if (sqrt == 0) {
            System.out.println("there is one answer X=" + result1);
        }
                if (sqrt > 0) {
                    System.out.println("There is 2 result: X1= " + result1 + "  X2= " + result2);
                }
            }

        }
