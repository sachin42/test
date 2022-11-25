//write a program to find the value of y if y = sqrt(x^2+2x+7)
import java.util.Scanner;
import java.lang.Math;
public class Quiz_11 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of x");
        double x = in.nextDouble();
        double y = Math.sqrt(Math.pow(x,2)+2*x+7);
        System.out.printf("if value of x = %.2f then y = %.2f",x,y);
    }
}
