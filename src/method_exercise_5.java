//Write a Java method to count all words in a string.
import java.util.Scanner;
public class method_exercise_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();
        System.out.println("Total numbers of words in the string is "+count_words(str));

    }

    public static int count_words(String x) {
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i)== ' ')
                count++;
        }
        return count+1;
    }
}
