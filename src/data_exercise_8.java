//8. Write a Java program that reads a number and display the square, cube, and fourth power.
import java.util.Scanner;
public class data_exercise_8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double num,sqr,cube,fourth;
        System.out.println("Enter number");
        num = in.nextDouble();

        sqr = num*num;
        cube = sqr*num;
        fourth = cube *num;

        System.out.printf("Square = %.2f\n",sqr);
        System.out.printf("cube = %.2f\n",cube);
        System.out.printf("fourth power = %.2f\n",fourth);
    }
}
