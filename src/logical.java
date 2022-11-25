//Logical operators
public class logical {
    public static void main(String[] args) {
        int a = 12;
        int b = 3;
        System.out.println(a + " > 2 && " + b + " < 3 = " + (a>2 && b<3)); // F
        System.out.println(a + " > 2 || " + b + " < 3 = " + (a>2 || b<3)); // T
        System.out.println("!" + a + " = " + !(a>b)); // F
    }
}
