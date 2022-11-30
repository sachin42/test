// 9. Write a Java program that takes a year from user and print whether that year is a leap year or not.
import java.util.Scanner;
public class con_exercise_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year;
        System.out.println("Enter the year");
        year = in.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " is a leap year.");
        } else
            System.out.println(year + " is not a leap year.");
    }
}
