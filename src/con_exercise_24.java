//24. Write a java program to generate a following @'s triangle.
//     @
//    @@
//   @@@
//  @@@@
// @@@@@
//@@@@@@
import java.util.Scanner;
public class con_exercise_24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = in.nextInt();
        int s=n-1;
        for (int i=0;i<n;i++){
            for (int j=s;j!=0;j--)
                System.out.print(" ");
            for (int k=n;k<=n+i;k++)
                System.out.print("@");
            System.out.println();
            s--;
        }
    }
}