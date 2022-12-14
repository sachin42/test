import java.util.Scanner;
public class WRNP_method {
    public static void main(String[] args) {
        int a=1, b = 2;
        System.out.println(a+" + "+b+" = "+(a+b) + "\n"+star());
    }
    public static int star(){
        Scanner in = new Scanner(System.in);
        System.out.println("\n Enter the number for print the star");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(" *");
        }
        return 0;
    }
}
