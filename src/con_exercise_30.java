//30. Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal,
// "All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise.
/*
Test Data
Input first number: 2564
Input second number: 3526
Input third number: 2456
Expected Output :

All numbers are different
 */
import java.util.Scanner;
public class con_exercise_30 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        double num1,num2,num3;
        System.out.println("Input first number:");
        num1 = in.nextDouble();
        System.out.println("Input second number:");
        num2 = in.nextDouble();
        System.out.println("Input third number:");
        num3 = in.nextDouble();

        if(num1==num2 && num2 == num3)
            System.out.println("All numbers are equal");
        else if (num1 == num2 || num2 == num3 || num3 == num1 )
            System.out.println("Neither all are equal or different");
        else
            System.out.println("All numbers are different");
    }
}
