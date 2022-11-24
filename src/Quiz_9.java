import java.util.Scanner;

public class Quiz_9 {
    public static void main(String[] args) {
        double amount,discount,netamount;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter shopping price ");
        amount = in.nextDouble();

        if (amount > 2000) {
            discount = amount * 0.2;
            netamount = amount - discount;
            System.out.println("Your shopping amount is = "+amount);
            System.out.println("your discount = "+discount);
            System.out.println("your net Payable amount = "+netamount);
        } else if (amount >= 1500 && amount < 2000) {
            discount = amount * 0.15;
            netamount = amount - discount;
            System.out.println("Your shopping amount is = "+amount);
            System.out.println("your discount = "+discount);
            System.out.println("your net Payable amount = "+netamount);
        }
    }
}
