//3. print a 10x10 grid having elements '-'
public class array_exercise_3 {
    public static void main(String[] args) {
        char[][] a = new char[10][10];

        for (int i = 0; i < 10;i++){
            for (int j = 0; j < 10;j++)
                a[i][j] = '-' ;
        }

        for (int i = 0; i < 10;i++){
            for (int j = 0; j < 10;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
