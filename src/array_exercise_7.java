//7. Write a Java program to remove a specific element from an array.
import java.util.Arrays;
import java.util.Scanner;
public class array_exercise_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = {33,22,34,23,24,21};
        System.out.println("Original Array:\n"+ Arrays.toString(num));
        System.out.println("Enter the index to remove a value:");
        int i = in.nextInt();
        for (int j = i; j < num.length-1; j++) {
            num[j] = num[j+1];
        }
        int[] num1 = new int[num.length-1];
        System.arraycopy(num, 0, num1, 0, num.length - 1); //arraycopy 1 index less than original.
        System.out.println("After removing given value Array:\n"+ Arrays.toString(num1));
    }
}
