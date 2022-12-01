//31. Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order,
// "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.
/*
Test Data
Input first number: 1524
Input second number: 2345
Input third number: 3321
Expected Output :

Increasing order
 */
import java.util.Scanner;
public class con_exercise_31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1, num2, num3;
        System.out.println("Input first number:");
        num1 = in.nextDouble();
        System.out.println("Input second number:");
        num2 = in.nextDouble();
        System.out.println("Input third number:");
        num3 = in.nextDouble();

        if (num3>num2 && num2>num1)
            System.out.println("increasing order");
        else if (num1>num2 && num2>num3)
            System.out.println("decreasing order");
        else
            System.out.println("Neither increasing or decreasing order");
    }
}
