//1. Write a Java program to get a number from the user and print whether it is positive or negative.
import java.util.Scanner;
public class con_exercise_1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num;
        System.out.println("Enter the number:");
        num = in.nextInt();

        if (num > 0){
            System.out.println(num+" is positive");
        } else if (num < 0) {
            System.out.println(num+" is negative");
        } else
            System.out.println("Number is zero");
    }
}
