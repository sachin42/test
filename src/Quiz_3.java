// To calculate the height of free-falling object for given time
// formula is Height =(gt^2)/2
import java.util.Scanner;

public class Quiz_3 {
    public static void main(String[] args) {
        double g = 9.8;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the time taken by object to touch the ground");
        double time = in.nextDouble();
        double height = (g*time*time)/2;

        System.out.printf("if an object free-fall for %.1f seconds then initial height of object = %.2f",time,height);

    }
}
