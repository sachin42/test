import java.util.Scanner;

public class Quiz_7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number for print the table");
        double num = in.nextDouble();
        int i=1;
        while (i <=10){
            System.out.println(num + " X "+ i + " = "+ num *i);
            i++;
        }
    }
}
