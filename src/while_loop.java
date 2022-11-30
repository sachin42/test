//Table with while loop.
import java.util.Scanner;
public class while_loop {
    public static void main(String[] args) {
        int i = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number Table");
        double num = in.nextDouble();
        while (i<=10){
            System.out.printf("%.2f x %d = %.2f\n",num,i,num*i);
            i++;
        }
    }
}
