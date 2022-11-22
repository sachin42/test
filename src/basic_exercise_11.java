import java.util.Scanner;

//11. Write a Java program to print the area and perimeter of a circle.
public class basic_exercise_11 {
    public static void main(String[] args) {
        double PI = 3.14;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        double radius = in.nextDouble();
        System.out.println("Perimeter of circle with radius " + radius + " = " + (2 * PI * radius)); // perimter of circle formula 2*PI*radius
    }
}