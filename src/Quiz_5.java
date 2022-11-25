/* Write a program to find the total height achieved and time of flight of a football if it kicked
 and achieved the speed of 40Km at 60-degree angle.
* */
public class Quiz_5 {
    public static void main(String[] args) {
//        initial speed and angle of projection are 40Km/hr and 60 degree
        double speed = 40,sin60=0.866025403,g= 9.807;
        double ms = speed/3.6;

//        time of flight is (2Vsin$)/g
        double t = (2*ms*sin60)/g;

//      maximum height = (v^2*sin^60)/2g
        double max_height = (ms*ms*sin60*sin60)/2*g;
        System.out.printf("if a football kicked with 40Km/hr velocity at 60 degree angle then \n maximum hight achived by ball = %.2f meters \n and time of flight = %.2f seconds ",max_height,t);
    }
}
