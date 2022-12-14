//Write a Java method to compute the average of three numbers.
import java.util.Scanner;
public class method_exercise_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        double a = in.nextDouble();
        System.out.println("Enter second number");
        double b = in.nextDouble();
        System.out.println("Enter third number");
        double c = in.nextDouble();
        System.out.println("The average of three numbers "+average(a,b,c));
    }

    public static double average(double x, double y, double z){
        return (x+y+z)/3;
    }
}
