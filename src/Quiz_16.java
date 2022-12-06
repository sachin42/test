// addition of two matrix
public class Quiz_16  {
    public static void main(String[] args) {
        int[][] arr1 = {{12,14,56},{13,15,65},{31,23,106}}, arr2={{19,17,26},{33,25,75},{17,23,104}};
        int[][] sum = new int[3][3];
//        addition
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
//         print
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j]+"   ");
            }
            System.out.println();
        }
    }
}
