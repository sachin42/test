// 12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
import java.util.Scanner;
public class basic_exercise_12 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        a = in.nextInt();

        System.out.println("Enter second number");
        b = in.nextInt();

        System.out.println("Enter third number");
        c = in.nextInt();

        double avarage = (a+b+c)/3.0;
        System.out.printf("Average of %d,%d and %d = %.2f",a,b,c,avarage);
    }
}
