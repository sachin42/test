import java.util.Scanner;

//6. Write a Java program to compute body mass index (BMI)
public class data_exercise_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height, weight, bmi;
        System.out.println("Enter height in meters");
        height = input.nextDouble();
        System.out.println("Enter weight in Kg");
        weight = input.nextDouble();

        bmi = weight/(height*height);
        System.out.printf("Body Mass Index of given Person is %.2f kg/m sqr",bmi);
    }
}