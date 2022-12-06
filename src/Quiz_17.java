// Print family members name
import java.util.Scanner;
public class Quiz_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] family = new String[3][3];
        int i ,j;
        String member;

        for ( i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++) {
                if (j == 0)
                    member = "Male's";
                else if (j == 1)
                    member = "Female's";
                else
                    member = "Kid's";

                System.out.println("Enter "+(i+1)+ " Family's "+member+ " name.");
                family[i][j]=in.next();
            }
        }

        for ( i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++)
                System.out.print(family[i][j]+ "    ");
            System.out.println();
        }
    }
}
