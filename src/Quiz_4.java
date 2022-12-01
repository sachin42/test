// calculate the equivalent resistance of three resistors if they are in series and parallel.
import java.util.Scanner;
public class Quiz_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r1,r2,r3,sr,pr;

        System.out.println("Enter the value of first resistor");
        r1 = in.nextDouble();
        System.out.println("Enter the value of second resistor");
        r2 = in.nextDouble();
        System.out.println("Enter the value of third resistor");
        r3 = in.nextDouble();

        sr = r1+r2+r3;

        pr = 1/((1/r1)+(1/r2)+(1/r3));

        System.out.printf("Equivalent resistance of given resistors in series = %.2f \n",sr);
        System.out.printf("Equivalent resistance of given resistors in parallel = %.2f ",pr);
    }
}
