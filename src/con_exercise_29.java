//29. Write a Java program that reads a positive integer and count the number of digits the number (less than ten billion) has.
/*
Test Data
Input an integer number less than ten billion: 125463
Expected Output :

Number of digits in the number: 6
 */
import java.util.Scanner;
public class con_exercise_29 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number less than ten billion: ");

        if (in.hasNextLong()) {
            long n = in.nextLong();
            if (n < 0)
                n *= -1;
            if (n >= 10000000000L)
                System.out.println("Number is greater or equals 10,000,000,000!");
            else {
                int digits = 1;
                if (n >= 10 && n < 100)
                    digits = 2;
                else if (n >= 100 && n < 1000)
                    digits = 3;
                else if (n >= 1000 && n < 10000)
                    digits = 4;
                else if (n >= 10000 && n < 100000)
                    digits = 5;
                else if (n >= 100000 && n < 1000000)
                    digits = 6;
                else if (n >= 1000000 && n < 10000000)
                    digits = 7;
                else if (n >= 10000000 && n < 100000000)
                    digits = 8;
                else if (n >= 100000000 && n < 1000000000)
                    digits = 9;
                else if (n >= 1000000000)
                    digits = 10;
                System.out.println("Number of digits in the number: " + digits);
            }
        }
        else
            System.out.println("The number is not an integer");
    }
}
