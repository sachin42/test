//Write a java program to find whether a number is prime or not.
import java.util.Scanner;
public class java_test_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, num, temp =0 ;
        System.out.println("Enter the number");
        num = in.nextInt();
        for ( i = 2; i <= num/2; i++) {
            if (num % i == 0){
                temp++;
                break;
            }
        }
        if(temp == 0 && num != 1){
            System.out.println(num+" is a prime number");
        } else
            System.out.println(num+" is not a prime number");
    }
}
