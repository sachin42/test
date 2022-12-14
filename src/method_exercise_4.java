//Write a Java method to count all vowels in a string
import java.util.Scanner;
public class method_exercise_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();
        System.out.println("Total numbers of vowels in string is "+count_vowels(str));

    }

    public static int count_vowels(String x) {
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 'a' || x.charAt(i) == 'e' || x.charAt(i) == 'i' || x.charAt(i) == 'o' || x.charAt(i) == 'u')
                count++;
        }
        return count;
    }
}
