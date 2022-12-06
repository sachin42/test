//2. Write a Java program to sum values of an array.
public class array_exercise_2 {
    public static void main(String[] args) {
        double[] num1={56.76,89.05,99,106,08.09,54.89};
        double sum = 0;
        System.out.print("Array : ");
        for (double v : num1) {                 // for (int i = 0;i < num1.length;i++){
            System.out.print(v + " ");
            sum += v;
        }
        System.out.println();
        System.out.println("sum of array is : "+sum);
    }
}
