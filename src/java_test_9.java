// Write a java program that searches a value in an m X n matrix.
public class java_test_9 {
    public static void main(String[] args) {
        int[][] arr ={{12,23,27},{34,35,56},{12,13,24}};
        int val = 12;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (val == arr[i][j]) {
                    System.out.println(val+" is present in the array at index ["+i+"]["+j+"].");
                    flag = true;
                }
            }
        }
        if(!flag){
            System.out.println(val+" is not present in the array");
        }
    }
}
