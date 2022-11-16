import java.util.Scanner;

//13. Write a Java program to print the area and perimeter of a rectangle.
public class exercise_13 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double width,length;

        System.out.println("Enter the width of rectangle");
        width = in.nextDouble();
        System.out.println("Enter the length of rectangle");
        length = in.nextDouble();

        double area = width * length;
        double perimeter = 2 *(width+length);

        System.out.printf("Perimeter of Given rectangle is %.2f \n",perimeter);
        System.out.printf("Area of Given rectangle is %.2f \n",area);
    }
}
