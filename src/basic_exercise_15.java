//15. Write a Java program to swap two variables.
public class basic_exercise_15 {
    public static void main(String[] args) {
        int a = 5, b= 7, temp;

        System.out.println("Before swap value of a = "+a+" and value of b = "+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("after swap value of a = "+a+" and value of b = "+b);

        System.out.println("--------------0------------------------------------");

        System.out.println("Without third variable swap");
        System.out.println("Before swap value of a = "+a+" and value of b = "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Before swap value of a = "+a+" and value of b = "+b);




    }
}
