// 16. Write a program in Java to display the pattern like right angle triangle with a number.
import java.util.Scanner;
public class con_exercise_16 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = in.nextInt();
        System.out.println();
        for (int i = 1;i <=n;i++){
            for (int j=1;j<=i;j++)
                System.out.print(j);
            System.out.println();
        }
    }
}
