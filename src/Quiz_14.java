import java.util.Scanner;

public class Quiz_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the terms");
        int n = in.nextInt();

        int first=0;
        int sec = 1,next;
        System.out.println("Fibonacci Series:");
        for (int i=0;i<n;++i){
            if(i<n-1)
                System.out.print(first+", ");
            else
                System.out.print(first+" ");

            next = first+sec;
            first=sec;
            sec=next;
        }
    }
}
