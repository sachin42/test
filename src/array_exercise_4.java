//4. Write a Java program to calculate the average value of array elements.
public class array_exercise_4 {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = {11,87,78,89,65,89,69,69,71};
        for (int i = 0; i < 9; i++) {
            sum += arr[i];
        }
        double average = sum /(float) arr.length;
        System.out.printf("Average of elements of array = %.2f",average);
    }
}
