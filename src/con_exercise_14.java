//14. Write a program in Java to display the multiplication table of a given integer.
//
//        Test Data
//        Input the number (Table to be calculated) : Input number of terms : 5
//        Expected Output :
//        5 X 1 = 5
//        5 X 2 = 10
//        5 X 3 = 15
//        5 X 4 = 20
//        5 X 5 = 25
import java.util.Scanner;
public class con_exercise_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n , num;
        System.out.println("Enter the number for table:");
        num = in.nextInt();
        System.out.println("Enter the number of terms");
        n = in.nextInt();

        for (int i=1;i<=n;i++){
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }
}
