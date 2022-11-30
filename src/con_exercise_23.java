//23. Write a java program to generate a following *'s triangle.
//******
// *****
//  ****
//   ***
//    **
//     *
import java.util.Scanner;
public class con_exercise_23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = in.nextInt();
        int s=0;
        for (int i=n;i!=0;i--){
            for (int j=s;j!=0;j--)
                System.out.print(" ");
            for (int k=0;k<i;k++)
                System.out.print("*");
            System.out.println();
            s++;
        }
    }
}
