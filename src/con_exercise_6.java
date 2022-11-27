//6. Write a Java program that reads in two floating-point numbers and tests whether
// they are the same up to three decimal places.
import java.util.Scanner;
public class con_exercise_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float num1,num2;
        System.out.println("Enter first floating point number");
        num1 = in.nextFloat();
        System.out.println("Enter second floating point number");
        num2 = in.nextFloat();

        num1 = Math.round(num1 * 1000);
        num1 /= 1000;

        num2 = Math.round(num2 * 1000);
        num2 /= 1000;

        if (num1 == num2){
            System.out.println("\n\nFirst Number"+num1);
            System.out.println("Second Number"+num2);
            System.out.println("Both numbers are same");
        } else {
            System.out.println("\n\nFirst Number"+num1);
            System.out.println("Second Number"+num2);
            System.out.println("Both numbers are not same");
        }
    }
}
