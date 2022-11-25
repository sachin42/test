//Bitwise Operators
public class bitwise {
    public static void main(String[] args) {
        int a = 12;
        int b = 7;
        System.out.println(a + " OR " + b + " = " + (a|b));
        System.out.println(a + " AND " + b + " = " + (a&b));
        System.out.println("Compliment " + a + " = " + (~a));
        System.out.println(a + " XOR " + b + " = " + (a^b));
        System.out.println(a + " Left Shift " + b + " = " + (a<<b));
        System.out.println(a + " Right Shift " + b + " = " + (a>>b));

    }
}
