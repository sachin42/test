//13. Write a program in Java to display the cube of the number up to given integer.
import java.util.Scanner;
public class con_exercise_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the numbers of terms");
        int n = in.nextInt();

        for (int i=1;i<=n;i++){
            System.out.println("Number is "+i+ " and cube of "+i+" = "+i*i*i);
        }
    }
}