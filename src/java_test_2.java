//Swap values of variable without using third variable.
public class java_test_2 {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        System.out.println("Before swap values of a and b are "+a+" and "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swap values of a and b are "+a+" and "+b);
    }
}
