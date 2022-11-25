/* Write a program to calculate the total shopping
if the price is greater than 2000 then 20% discount will be applied
if the price is greater than 1500 and less than 2000 then 15% discount will be applied
if the price is greater than 1000 and less than 1500 then 10% discount will be applied
if the price is less than 1500 then 5% discount will be applied

calculate the flat discount and net payable amount
* */
import java.util.Scanner;
public class Quiz_9 {
    public static void main(String[] args) {
        double amount,discount,netamount;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter shopping price ");
        amount = in.nextDouble();

        if (amount >= 2000) {
            discount = amount * 0.2;
            netamount = amount - discount;
            System.out.printf("Your shopping amount is = %.2f\n",amount);
            System.out.printf("your discount = %.2f\n",discount);
            System.out.printf("your net Payable amount = %.2f\n",netamount);
        } else if (amount >= 1500) {
            discount = amount * 0.15;
            netamount = amount - discount;
            System.out.printf("Your shopping amount is = %.2f\n",amount);
            System.out.printf("your discount = %.2f\n",discount);
            System.out.printf("your net Payable amount = %.2f\n",netamount);
        } else if (amount >= 1000) {
            discount = amount * 0.10;
            netamount = amount - discount;
            System.out.printf("Your shopping amount is = %.2f\n",amount);
            System.out.printf("your discount = %.2f\n",discount);
            System.out.printf("your net Payable amount = %.2f\n",netamount);
        } else {
            discount = amount * 0.05;
            netamount = amount - discount;
            System.out.printf("Your shopping amount is = %.2f\n",amount);
            System.out.printf("your discount = %.2f\n",discount);
            System.out.printf("your net Payable amount = %.2f\n",netamount);
        }
    }
}
