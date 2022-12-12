import java.util.Scanner;

public class NRNP_method {
    public static void main(String[] args) {
        result();
    }
    public static void result(){
        int h,e,m,p;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the marks in Hindi");
        h = in.nextInt();
        System.out.println("Enter the marks in English");
        e = in.nextInt();
        System.out.println("Enter the marks in Maths");
        m = in.nextInt();
        System.out.println("Enter the marks in Physics");
        p = in.nextInt();
        int percent = (h+e+m+p)/4;
        System.out.println(" percent ="+percent);
    }
}
