import java.lang.Math;
public class Quiz_10 {
    public static void main(String[] args) {
        int x1=2,x2=17,y1=5,y2=-4;
        double d = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.printf("Distance  between points (%d,%d) and (%d,%d) = %.2f",x1,y1,x2,y2,d);
//        System.out.println("Distance between points ("+x1+","+y1+") and ("+x2+","+y2+") = "+d);
    }
}
