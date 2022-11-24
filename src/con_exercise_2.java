//2. Write a Java program to solve quadratic equations (use if, else if and else).
import java.util.Scanner;
import java.lang.Math;

public class con_exercise_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a,b,c,d,x,y;

        System.out.println("Enter a");
        a = in.nextDouble();
        System.out.println("Enter b");
        b = in.nextDouble();
        System.out.println("Enter c");
        c = in.nextDouble();

        d = b*b - 4*a*c;

        if (d == 0) {
            System.out.println("Both roots are the same");
            x = -b / (a * 2);
            System.out.printf("root = %f\n",x);
        } else if (d > 0) {
            System.out.println("roots are different and follows:");
            x = (-b + Math.sqrt(d))/2*a;
            y = (-b - Math.sqrt(d))/2*a;
            System.out.printf("first root = %f\n",x);
            System.out.printf("second root = %f\n",y);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
