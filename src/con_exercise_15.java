//15. Write a program in Java to display the n terms of odd natural number and their sum.
import java.util.Scanner;
public class con_exercise_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0,n;
        System.out.println("Input the n terms:");
        n = in.nextInt();
        System.out.println("Odd numbers up to "+n+" terms are:");
        for (int i=1;i<=n;i++){
            System.out.println(2*i-1);
            sum += 2*i-1;
        }
        System.out.println("Sum of odd numbers up to "+n+" terms = "+sum);
    }
}
