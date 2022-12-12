//Write a java program to print reverse of a number given by user.
import java.util.Scanner;
public class java_test_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        long num = in.nextLong();
        long rev = 0;
        System.out.print(num);
        while(num > 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println(" Reversed is "+ rev);
    }
}
