//19. Write a program in Java to make such a pattern like a pyramid with a number which will repeat the number in the same row.
//    1
//   2 2
//  3 3 3
// 4 4 4 4
import java.util.Scanner;
public class con_exercise_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = in.nextInt();
        int s = n-1;
        for (int i=1;i<=n;i++){
            for (int j=s;j!=0;j--)
                System.out.print(" ");
            for (int k=0;k<i;k++)
                System.out.printf("%d ",i);
            System.out.println();
            s--;
        }
    }
}
