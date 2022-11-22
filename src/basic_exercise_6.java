// 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
import java.util.Scanner;

public class basic_exercise_6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b;
        System.out.printf("Input first number : ");
        a = input.nextInt();
        System.out.printf("Input second number : ");
        b = input.nextInt();

        System.out.printf("%d + %d = %d\n",a,b,a+b);
        System.out.printf("%d - %d = %d\n",a,b,a-b);
        System.out.printf("%d X %d = %d\n",a,b,a*b);
        System.out.printf("%d / %d = %d\n",a,b,a/b);
        System.out.printf("%d mod %d = %d\n",a,b,a%b);

    }
}
