//5. Write a Java program to test if an array contains a specific value.
import java.util.Scanner;
public class array_exercise_5 {
    public static void main(String[] args) {
        boolean check = false;
        int[] arr = {23,2011,2012,34,677,233,66,67,2034};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a num to compare");
        int sc= in.nextInt();
        for (int i = 0; i < 9; i++) {
            if(arr[i]==sc) {
                System.out.println(sc + " is an element of array and it's location is = " + (i + 1));
                check = true;
            }
        }
        if (!check)
            System.out.println(sc+" is not an element of array");
    }
}
