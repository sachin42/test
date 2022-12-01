//9. Write a Java program that accepts two integers from the user and then prints the sum, the difference, the product, the average,
// the distance (the difference between integer), the maximum (the larger of the two integers), the minimum (smaller of the two integers).
import java.util.Scanner;
public class data_exercise_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a , b;
        System.out.println("Enter First number");
        a = in.nextInt();
        System.out.println("Enter Second number");
        b = in.nextInt();

        int sum = a+b;
        int diff = a-b;
        int pro = a*b;
        double average = (double) sum/2;

        System.out.println("sum of two numbers = "+sum);
        System.out.println("difference of two numbers = "+diff);
        System.out.println("Product of two numbers = "+pro);
        System.out.printf("Average of two numbers = %.2f\n",average);

        if (a > b){
            int dist = a - b;
            System.out.println("Distance between two number = "+dist);
            System.out.println("Max integer : "+a);
            System.out.println("Min integer : "+b);
        } else if (a < b) {
            int dist = b - a;
            System.out.println("Distance between two number = "+dist);
            System.out.println("Max integer : "+b);
            System.out.println("Min integer : "+a);
        } else {
            System.out.println("Distance between two number = 0");
            System.out.println("Both Integer are same");
        }
    }
}
