//7. Write a Java program to find the number of days in a month in any year and print if leap year or not.
import java.util.Scanner;
public class con_exercise_7 {
    public static void main(String[] args) {
        boolean leap_year ;
        String month_name = "0";
        String year_type ;
        int month,year,days = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Input month");
        month = in.nextInt();
        System.out.println("Input year");
        year = in.nextInt();

        if (year % 4 == 0){
            if(year % 100 == 0){
                if (year % 400 == 0){
                    leap_year = true;
                    year_type = "(a leap year)";
                } else {
                    leap_year = false;
                    year_type = "(not a leap year)";
                }
            } else {
                leap_year = true;
                year_type = "(a leap year)";
            }
        } else {
            leap_year = false;
            year_type = "(not a leap year)";
        }

        switch (month){
            case 1:
                month_name = "January";
                days = 31;
                break;
            case 3:
                month_name = "March";
                days = 31;
                break;
            case 5:
                month_name = "May";
                days = 31;
                break;
            case 7:
                month_name = "July";
                days = 31;
                break;
            case 8:
                month_name = "August";
                days = 31;
                break;
            case 10:
                month_name = "October";
                days = 31;
                break;
            case 12:
                month_name = "December";
                days = 31;
                break;
            case 2:
                month_name = "February";
                if (leap_year){
                    days = 29;
                } else
                    days = 28;
                break;
            case 4:
                month_name = "April";
                days = 30;
                break;
            case 6:
                month_name = "June";
                days = 30;
                break;
            case 9:
                month_name = "September";
                days = 30;
                break;
            case 11:
                month_name = "November";
                days = 30;
                break;

            default:
                System.out.println("Invalid Entry");
        }

        System.out.println(month_name+ " "+year+year_type+ " has "+ days+ " days.");
    }
}
