//8. Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant,
//   depending on the user input. If the user input is not a letter (between a and z or A and Z),
//   or is a string of length > 1, print an error message.
import java.util.Scanner;
public class con_exercise_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean run = false;
        String type = null;
        char input;
        System.out.println("Input the character: ");
        input = in.next().charAt(0);

        switch (input){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                type = "Vowel";
                break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
            case 'B':
            case 'C':
            case 'D':
            case 'F':
            case 'G':
            case 'H':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                type = "Consonant";
                break;
            default:
                System.out.println("Invalid Entry");
                run = true;
                break;
        }
        if (!run) {
            System.out.println(input + " is a " + type);
        }
    }
}
