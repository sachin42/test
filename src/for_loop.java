import java.util.Scanner;
// multiple condition for loop
public class for_loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        double num = in.nextDouble();
        for (int i=1,j=5;i<=10 || j>=0;i++,j--){
            System.out.printf("%.2f X %d = %.2f",num,i,num*i);
            System.out.println("-----------------------");
            System.out.println(j);
        }
    }
}
