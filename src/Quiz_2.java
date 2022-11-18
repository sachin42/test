import java.util.Scanner;

public class Quiz_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("For kilometer to Centimeter choose 'A', For Mile to Inch choose 'B', For Pound to Kg choose 'C', \nFor Dollar to Rupees choose 'D', For Celsius to Fahrenheit choose 'E' ");
        char sel = input.next().charAt(0);

        switch (sel){
            case 'A':
            {
                System.out.println("Enter value in Kilo meter:");
                double km = input.nextDouble();
                double cm = km * 100000;
                System.out.printf("%.2f Kilometer in Centimeter = %.2f",km,cm);
                break;
            }
            case 'B':
            {
                System.out.println("Enter value in Miles:");
                double miles = input.nextDouble();
                double inch = miles * 63360;
                System.out.printf("%.2f Miles in Inches = %.2f",miles,inch);
                break;
            }
            case 'C':
            {
                System.out.println("Enter value in Pound:");
                double pound = input.nextDouble();
                double kg = pound * 0.453592;
                System.out.printf("%.2f Pounds in Kilograms = %.2f",pound,kg);
                break;
            }
            case 'D':
            {
                System.out.println("Enter value in Dollar:");
                double usd = input.nextDouble();
                double inr = usd * 81.75;
                System.out.printf("%.2f Dollars in Indian Rupees = %.2f",usd,inr);
                break;
            }
            case 'E':
            {
                System.out.println("Enter Temperature in Fahrenheit:");
                double temp_f = input.nextDouble();
                double temp_c = (temp_f - 32.0) * 5.0/9.0;
                System.out.printf("%.2f deg Celsius in Fahrenheit = %.2f",temp_f,temp_c);
                break;
            }
            default:
                System.out.println("Invalid Entry");
        }

    }
}
