//Relational operators
@SuppressWarnings("ConstantConditions")
public class relational {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println(a + "<" + b + " = " + (a<b));    // T
        System.out.println(a + ">" + b + " = " + (a>b));    // F
        System.out.println(a + "==" + b + " = " + (a==b));  // F
        System.out.println(a + "<=" + b + " = " + (a<=b));  // T
        System.out.println(a + ">=" + b + " = " + (a>=b));  // F
        System.out.println(a + "!=" + b + " = " + (a!=b));  // T
    }
}
