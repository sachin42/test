//12. Write a program in Java to input 5 numbers from keyboard and find their sum and average.
import java.util.Scanner;
public class con_exercise_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num,sum=0,avg ;

        for (int i = 1; i <=5; i++){
            System.out.println("Enter "+i+" number");
            num = in.nextDouble();
            sum += num;
        }

        avg = sum/5;

        System.out.printf("Sum of entered five number = %.2f\n",sum);
        System.out.printf("Average of entered five number = %.2f\n",avg);
    }
}
