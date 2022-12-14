// Write a program having a class helper service having number formatting
public class Quiz_20 {
    public static void main(String[] args) {
        format_number(10);
        format_number("SACHIN");
        format_number(10.67f);
    }
    public static void format_number(float a){
        System.out.println(a+" is a float");
    }
    public static void format_number(int a){
        System.out.println(a+" is a integer");
    }
    public static void format_number(String a){
        System.out.println(a+" is a String");
    }
}
