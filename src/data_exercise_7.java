//7. Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).
import java.util.Scanner;
public class data_exercise_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double dist;
        int hour,minute,second;
        System.out.println("Enter distance in meters");
        dist = input.nextDouble();
        System.out.println("Enter hours");
        hour = input.nextInt();
        System.out.println("Enter minutes");
        minute = input.nextInt();
        System.out.println("Enter second");
        second = input.nextInt();

        second = hour * 3600 + minute * 60 + second;

        double ms =dist/second;

        System.out.printf("Speed in meter per second is %.2f m/s\n",ms);

        double kmh = ms * (3.6);

        System.out.printf("Speed in kilometer per hour is %.2f km/h\n",kmh);

        double mile_h = kmh * 1.609;

        System.out.printf("Speed in miles per hour is %.2f miles/h\n",mile_h);

    }
}
