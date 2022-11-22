import java.util.Scanner;

//7. Write a Java program that takes a number as input and prints its multiplication table upto 10.
public class basic_exercise_7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a;
        System.out.println("Enter the number :");
        a = in.nextInt();

        for (int i=0; i <10; i++ ){
            System.out.printf("%d X %d = %d\n",a,i+1,a*(i+1));
        }
    }
}
