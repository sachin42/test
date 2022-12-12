//Write a program to print the difference and product of the number entered by user.
import java.util.Scanner;
public class java_test_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter first number");
        num1 = in.nextInt();
        System.out.println("Enter second number");
        num2 = in.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;

        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " * " + num2 + " = " + product);
    }
}
