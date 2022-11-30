//20. Write a program in Java to print the Floyd's Triangle.
import java.util.Scanner;
public class con_exercise_20 {
    public static void main(String[] args) {
        int n,k=1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        n = in.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++)
                System.out.print(k++ + " ");
            System.out.println();
        }
    }
}
