//Searching in array
import java.util.Scanner;
public class Quiz_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num1 = {5,6,7,8,9,10};
        int b=-1;
        var flag = false ;
        System.out.println("Enter the value to check");
        int value = in.nextInt();

        for ( int i = 0;i< num1.length;i++) {
            if (value == num1[i]) {
                flag = true;
                b = i;
            }
        }

        if (flag)
            System.out.println(value+" is present in array at index : "+b);
        else
            System.out.println(value+" is not present in array.");

    }
}
