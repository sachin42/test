//21. Write a program in Java to display the pattern like a diamond.
import java.util.Scanner;
public class con_exercise_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = in.nextInt();
        int s = n-1;
        for (int i=1;i<=n;i++){
            for (int j=s;j!=0;j--)
                System.out.print(" ");
            for (int k=0;k<i*2-1;k++)
                System.out.print("*");
            System.out.println();
            s--;
        }
        s=1;
        for (int i=n-1;i!=0;i--){
            for (int j=s;j!=0;j--)
                System.out.print(" ");
            for (int k=0;k<i*2-1;k++)
                System.out.print("*");
            System.out.println();
            s++;
        }
    }
}
