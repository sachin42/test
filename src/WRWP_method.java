import java.util.Scanner;
public class WRWP_method {
    public static void main(String[] args) {
        int a,b;
        Scanner in = new Scanner(System.in);
        int option;
        do {
            System.out.println("\nChoose Option...");
            System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div\n5.Quit");
            option = in.nextInt();
            System.out.println("Enter the value of a");
            a = in.nextInt();
            System.out.println("Enter the value of b");
            b = in.nextInt();
            switch (option){
                case 1:
                    System.out.println(a + " + "+ b + " = "+add(a,b));
                    break;
                case 2:
                    System.out.println(a + " - "+ b + " = "+sub(a,b));
                    break;
                case 3:
                    System.out.println(a + " X "+ b + " = "+mul(a,b));
                    break;
                case 4:
                    System.out.println(a + " / "+ b + " = "+div(a,b));
                    break;

            }

        }while(option != 5);


    }
    private static int add(int x, int y){
        return x+y;
    }
    private static int sub(int x, int y){
            return x-y;
    }
    private static int mul(int x, int y){
        return x*y;
    }
    private static int div(int x, int y){
        return x/y;
    }
}
