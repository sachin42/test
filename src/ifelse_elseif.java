import java.util.Scanner;
public class ifelse_elseif {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = in.nextInt();
        if (age >= 18)
        {
            System.out.println("You are eligible for voting.");
        }
        else if (age < 5 && age > 0)
        {
            System.out.println("Yoy can vote for kids only.");
        }
        else if (age < 10 && age > 5)
        {
            System.out.println("You can vote for school only.");
        }
        else if (age < 18 && age > 10)
        {
            System.out.println("you can vot for college only.");
        }
        else
        {
            System.out.println("You are not eligible for Voting.");
        }
    }
}
