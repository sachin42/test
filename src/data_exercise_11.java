// 11. Write a Java program to test whether a given double/float value is a finite floating-point value or not.
import java.util.Scanner;

public class data_exercise_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a floating point value:");
        float f1 = in.nextFloat();

        if (Float.isFinite(f1)){
            System.out.println(f1+" is finite");
        } else
            System.out.println(f1+" is infinite");
    }
}
