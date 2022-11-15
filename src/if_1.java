import java.util.Scanner;
public class if_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = in.nextInt();
        if (age > 18)
        {
            System.out.println("You are eligible for voting.");
        }
    }
}