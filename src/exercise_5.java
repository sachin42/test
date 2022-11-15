import java.util.Scanner;

// 5.Write a Java program that takes two numbers as input and display the product of two numbers
public class exercise_5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);// for taking input
        int a,b;

        System.out.println("Input first Number :");
        a=input.nextInt();
        System.out.println("Input second Number :");
        b=input.nextInt();
        System.out.printf("%d X %d = %d",a,b,a*b);
    }
}
