//22. Write a Java program to display Pascal's triangle.
//Input number of rows: 5
//            1
//           1 1
//          1 2 1
//         1 3 3 1
//        1 4 6 4 1
import java.util.Scanner;
public class con_exercise_22 {
    public static void main(String[] args) {
        int i,j,k,n,c=1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        n = in.nextInt();
        for (i=0;i<n;i++){
            for (k=1;k<=n-i;k++) {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++) {
                if (j == 0 || i == 0)
                    c = 1;
                else
                    c = c * (i - j + 1) / j;
                System.out.print(" " + c);
            }
            System.out.println();
        }
    }
}
