//3. Take three numbers from the user and print the greatest number.
import java.util.Scanner;
public class con_exercise_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float num1,num2,num3;
        System.out.println("Input 1st number:");
        num1 = in.nextFloat();
        System.out.println("Input 2nd number:");
        num2 = in.nextFloat();
        System.out.println("Input 3rd number:");
        num3 = in.nextFloat();

        if (num1 > num2){
            if (num1 > num3){
                System.out.println("Greatest of three = "+num1);
            }else
                System.out.println("Greatest of three = "+num3);
        } else if (num2 > num3){
            System.out.println("Greatest of three = "+num2);
        } else
            System.out.println("Greatest of three = "+num3);
    }
}
