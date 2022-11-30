// Ap series in all loops
import java.util.Scanner;
public class Quiz_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(" do while loop\n\n\n");

        System.out.println("Enter the value of a");
        double a = in.nextDouble();
        System.out.println("Enter the value of d");
        double d = in.nextDouble();

        int n = 0;

        do{
            System.out.printf("%.2f, ",a);
            a+=d;
            n++;
        } while(n<10);

        System.out.println("\n--------------------------------------");

        System.out.println(" \n\n\nfor loop\n\n\n");
        System.out.println("Enter the value of a");
         a = in.nextDouble();
        System.out.println("Enter the value of d");
         d = in.nextDouble();

         for ( n = 1;n<=10;n++){
             System.out.printf("%.2f, ",a+(n-1)*d);
         }

        System.out.println("\n--------------------------------------");

        System.out.println(" \n\n\nwhile loop\n\n\n");
        System.out.println("Enter the value of a");
        a = in.nextDouble();
        System.out.println("Enter the value of d");
        d = in.nextDouble();

        n=1;
        while (n<10){
            System.out.printf("%.2f, ",a+(n-1)*d);
            n++;
        }
    }
}
