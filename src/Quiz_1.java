/* Calculate the percentage of student of 5 subjects marks entered by user
if marks are more than 75% passed with honors
60 - 75% passed with first division
45-60% passed with second division
33-45% passed with third division
less 33 % failed
*/
import java.util.Scanner;
public class Quiz_1 {
    public static void main(String[] args) {
        double total_marks,percentage,hindi,math,science,english,social_science;
        Scanner input=new Scanner(System.in);

//        entering Marks
        System.out.println("Enter marks secured in Hindi out of hundred:");
        hindi= input.nextDouble();
        System.out.println("Enter marks secured in Mathematics out of hundred:");
        math= input.nextDouble();
        System.out.println("Enter marks secured in Science out of hundred:");
        science= input.nextDouble();
        System.out.println("Enter marks secured in English out of hundred:");
        english= input.nextDouble();
        System.out.println("Enter marks secured in Social Science out of hundred:");
        social_science = input.nextDouble();

//        calculating total marks and percentage
        total_marks = hindi+math+science+english+social_science;
        percentage = (total_marks * 100)/500;

//        printing results
        if (percentage > 75.0){
            System.out.printf("You have secured %.2f and Passed with Honor",percentage);
        } else if (percentage > 60.0 && percentage < 75.0) {
            System.out.printf("You have secured %.2f and Passed with First Division",percentage);
        } else if (percentage > 45.0 && percentage < 60.0) {
            System.out.printf("You have secured %.2f and Passed with Second Division",percentage);
        } else if (percentage > 33.0 && percentage < 45.0){
            System.out.printf("You have secured %.2f and Passed with Third Division",percentage);
        } else if (percentage < 33.0) {
            System.out.printf("You have secured %.2f and Failed try again",percentage);
        }


    }
}
