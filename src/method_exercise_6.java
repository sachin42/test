// Write a Java method to compute the sum of the digits in an integer.
import java.util.Scanner;
public class method_exercise_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = in.nextInt();
        System.out.println("Sum of all the digits in the number = "+sum(num));
    }

    public static int sum(int x) {
        int sum = 0;
        while (x>0){
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}
