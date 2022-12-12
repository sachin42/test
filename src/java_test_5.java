// A student will not be permitted to sit in exam if attendance is less than 75%.
// take input as number of classes held and attended and calculate percentage on attendance.
import java.util.Scanner;
public class java_test_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of classes held");
        int held = in.nextInt();
        System.out.println("Enter no. of classes attended");
        int attended = in.nextInt();

        double percentage = (attended * 100) / (float) held;
        if (percentage >= 75)
            System.out.println("Student is permitted to sit in exam.");
        else
            System.out.println("Student is not permitted to sit in exam.");
    }
}
