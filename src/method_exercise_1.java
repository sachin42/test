//write a java method to print smallest value of three inputs by user.
import java.util.Scanner;
public class method_exercise_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        double a = in.nextDouble();
        System.out.println("Enter second number");
        double b = in.nextDouble();
        System.out.println("Enter third number");
        double c = in.nextDouble();
        System.out.println(" The smallest value is "+smallest(a,b,c));
    }
    public static double smallest(double x, double y, double z){
        return Math.min(Math.min(x,y),z);
    }
}
