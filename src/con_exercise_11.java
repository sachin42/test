//11. Write a program in Java to display n terms of natural numbers and their sum.
import java.util.Scanner;
public class con_exercise_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n terms:");
        int n = in.nextInt();
        int sum = 0;

        System.out.println("The first "+n+" natural numbers are :\n");
        for (int i = 1; i <= n;i++){
            System.out.println(i);
            sum += i;
        }

        System.out.println("Sum of first " +n+" natural numbers = "+sum);
    }
}
