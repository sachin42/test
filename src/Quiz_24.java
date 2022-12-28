public class Quiz_24 {
    static int Quiz_24(int num1 ,int num2){
        return num1 + num2;
    }
    static double Quiz_24(double num1,int num2){
        return num1 - num2;
    }
    public static void main(String[] args) {
        int a = 12, b = 25;
        double c = 50;
        System.out.println(Quiz_24(a,b));
        System.out.println(Quiz_24(c,b));
    }
}
