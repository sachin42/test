// do while loop
import java.util.Scanner;
public class do_while_loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        System.out.println("Enter the number for table");
        double num = in.nextDouble();
        do{
            System.out.printf("%.2f X %d = %.2f\n",num,i,num*i);
            i++;
        } while (i <= 10);
    }
}
