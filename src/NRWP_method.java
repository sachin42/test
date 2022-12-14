import java.util.Scanner;
public class NRWP_method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int b = in.nextInt();
        odd_even(b);

    }

    public static void odd_even(int a) {
        if (a % 2 == 0)
            System.out.println(a+" is Even.");
        else
            System.out.println(a+" is odd.");
    }
}
