//Write a program to convert entered number of days into years,Months,Weeks & days.
import java.util.Scanner;
public class java_test_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int noOfDays ,year,month,week,days,remain;
        System.out.println("Enter the total number of days");
        noOfDays = in.nextInt();

        year = noOfDays / 365;
        remain = noOfDays % 365;
        month = remain / 12;
        remain = remain % 12;
        week = remain / 7;
        remain = remain % 7;
        days = remain;

        System.out.println(noOfDays+" Days = "+ year+ " years, "+month+" months, "+week+" weeks & "+days+" days.");
    }
}
