//nested if conditional statement
import java.util.Scanner;
public class nested_if {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = in.nextInt();
        if (age>=18){
            System.out.println("Do you have id");
            String id = in.next();
            if (id.equals("yes")){
                System.out.println("Go ahead and place your vote.");
            } else {
                System.out.println("You can not vote without Id.");
            }
        } else {
            System.out.println("You are not eligible for voting.");
        }
    }
}
