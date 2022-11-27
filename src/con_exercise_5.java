//5. Write a Java program that keeps a number from the user and generates
// an integer between 1 and 7 and displays the name of the weekday.
import java.util.Scanner;
public class con_exercise_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean a = true;

        while (a){
            System.out.println("\nInput an integer from 1 to 7: ");
            int day = in.nextInt();
            switch (day){
                case 1:
                    System.out.println("Weekday: Monday");
                    break;
                case 2:
                    System.out.println("Weekday: Tuesday");
                    break;
                case 3:
                    System.out.println("Weekday: Wednesday");
                    break;
                case 4:
                    System.out.println("Weekday: Thursday");
                    break;
                case 5:
                    System.out.println("Weekday: Friday");
                    break;
                case 6:
                    System.out.println("Weekday: Saturday");
                    break;
                case 7:
                    System.out.println("Weekday: Sunday");
                    break;
                case 0:
                    a = false;
                    System.out.println("------Thank You------");
                    break;
                default:
                    System.out.println("Invalid Entry");
            }
        }
    }
}
