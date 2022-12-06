//print the element of pre defined element
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {10,20,30,40,50,60};
        for (int i=0;i<6;i++)
            System.out.println(i+ ". "+arr[i]);

//      datatype[]name = new datatype[size];
//      take input from user for an array
        int[] num1 = new int[6];
        for (int i=0;i<6;i++) {
            System.out.println("Enter the element no. " + i + " of array");
            num1[i] = in.nextInt();
        }
        System.out.println("--------------------------------------------");
        for (int i=0;i<6;i++)
            System.out.print(num1[i]+"\t");
    }
}
