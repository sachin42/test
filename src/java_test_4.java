//write a program to check whether an entered character is lowercase(a-z) or uppercase(A-Z).
import java.util.Scanner;
public class java_test_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the letter");
        char alpha = in.next().charAt(0);
        char chara='a';
        char charA = 'A';
        for (int i = 0; i < 26; i++) {
            if(alpha==chara)
                System.out.println("entered letter is lower case");
            if (alpha==charA)
                System.out.println("entered letter is Upper case");
            chara++;
            charA++;
        }
    }
}
