public class assignment {
    public static void main(String[] args) {
        int a = 32;
        int b = 12;
        System.out.println(a + " += " + b + " = "+(a+=b)); // a = a+b
        System.out.println(a + " -= " + b + " = " +(a-=b)); // a = a-b
        System.out.println(a + " *= " + b + " = " +(a*=b)); // a = a*b
        System.out.println(a + " /= " + b + " = " +(a/=b)); // a = a/b
        System.out.println(a + " %= " + b + " = " +(a%=b)); // a = a%=b
    }
}
