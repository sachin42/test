//Write a Java method to display the middle character of a string
import java.util.Scanner;
public class method_exercise_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String name = in.next();
        System.out.println("The middle character of string is "+middle(name));

    }

    public static String middle(String x) {
        int position;
        int length;
        if (x.length() % 2 == 0){
            position = x.length() / 2 - 1;
            length = 2;
        } else {
            position = x.length() / 2;
            length = 1;
        }
        return x.substring(position,position+length);
    }
}
