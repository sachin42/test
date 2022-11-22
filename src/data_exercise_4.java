// 4. Write a Java program to convert minutes into a number of years and days.
import java.util.Scanner;
public class data_exercise_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of minutes");
        long min = in.nextLong();
        long year = min / (365*24*60);
        long remaining_min = min % (365*24*60);
        long days = remaining_min / (24*60);
        System.out.println(min+ " minutes = "+ year + " year and "+days+" days");
    }
}
