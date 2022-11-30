//18. Write a program in Java to make such a pattern like right angle triangle with number increased by 1.The pattern like :
//
//        1
//        2 3
//        4 5 6
//        7 8 9 10
import java.util.Scanner;
public class con_exercise_18 {
    public static void main(String[] args) {
        int k =1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = in.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++)
                System.out.printf("%d ",k++);
            System.out.println();
        }
    }
}
