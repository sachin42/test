//10. Write a Java program to break an integer into a sequence of individual digits. Go to the editor
//
//        Test Data
//        Input six non-negative digits: 123456
//        Expected Output :
//        1 2 3 4 5 6
import java.util.Scanner;
public class data_exercise_10 {
    public static void main(String[] args) {
        int six,five,four,three,two,one,num,remain;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a six digit number");
        num = in.nextInt();

        six = num % 10;
        remain = num / 10;
        five = remain % 10;
        remain = remain / 10;
        four = remain % 10;
        remain = remain / 10;
        three = remain % 10;
        remain = remain / 10;
        two = remain % 10;
        remain = remain / 10;
        one = remain % 10;


        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
    }
}
