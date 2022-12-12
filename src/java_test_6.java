// Write a program to print a jagged array and input taken by user.
import java.util.Scanner;
public class java_test_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] array_name = new int[3][];  //n: no. of rows
        array_name[0] = new int[4]; //4= no. of columns in row-1
        array_name[1] = new int[5]; //5= no. of columns in row-2
        array_name[2] = new int[3]; //3= no. of columns in row-3

        for (int i = 0; i < array_name.length; i++) {
            for (int j = 0; j < array_name[i].length; j++) {
                System.out.println("Enter the element at the index ["+i+"]["+j+"].");
                array_name[i][j] = in.nextInt();
            }
        }

        for (int[] ints : array_name) {
            for (int anInt : ints)
                System.out.print(anInt + "\t");
            System.out.println();
        }

    }
}
