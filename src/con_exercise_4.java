//4. Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative".
// Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
import java.util.Scanner;
public class con_exercise_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter floating point value");
        float num = in.nextFloat();

        if (num > 0) {
            System.out.println("Input value: " + num);
            if (num < 1) {
                System.out.println("Small Positive number");
            } else if (num > 1000000) {
                System.out.println("large positive number");
            } else {
                System.out.println("Positive number");
            }
        } else if (num < 0) {
            System.out.println("Input value: " + num);
            if (num > -1) {
                System.out.println("Small Negative number");
            } else if (num < -1000000) {
                System.out.println("large Negative number");
            } else {
                System.out.println("Negative number");
            }
        } else {
            System.out.println("Zero");
        }
    }
}
