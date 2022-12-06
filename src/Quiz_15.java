//import java.util.Scanner;

public class Quiz_15 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        int i,j;
        char[][] arr = {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
        for ( i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++)
                System.out.print(arr[i][j]+"\t");
            System.out.println();
        }
    }
}
