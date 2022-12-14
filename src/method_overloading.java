public class method_overloading {
    public static void main(String[] args) {
        display(10);
        display("Electrocus");
        display('S');
    }

    public static int display(int a) {
        System.out.println(a+" is an integer");
        return a;
    }

    public static String display(String a) {
        System.out.println(a+" is a string");
        return a;
    }

    public static char display(char a) {
        System.out.println(a+" is a character");
        return a;
    }
}
