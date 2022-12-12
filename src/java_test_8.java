// Write a java program to reverse a string without using string inbuilt function reverse().
import java.util.Scanner;
public class java_test_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String name = in.nextLine();

        System.out.print(name);
        StringBuilder reverse = new StringBuilder();
        for (int i = name.length()-1; i >=0 ; i--)
            reverse.append(name.toCharArray()[i]);
        System.out.println(" Reversed is "+reverse);
    }
}
