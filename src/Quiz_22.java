import java.util.Scanner;

public class Quiz_22 {
    static class people{
        double height;
        String color;
        String language;
        String foodType;
        void displayState(){
            System.out.println(color + "\t"+height);
        }
        void displayBehavior(){
            System.out.println(language+"\t"+foodType);
        }
        people(double h,String c,String l,String f){
            this.height=h;
            this.color=c;
            this.language=l;
            this.foodType=f;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        people asians = new people(5, "pale-white", "Mandarin", "Mixed");
        people europeans = new people(5.5, "White", "English", "vegetarian");
        people africans = new people(6, "Black,dark", "African's", "Non-vegetarian");
        System.out.println("choose 'a' for state 'b' for behavior:");
        char choice=in.next().charAt(0);
        switch (choice){
            case 'a':
                asians.displayState();
                europeans.displayState();
                africans.displayState();
                break;
            case 'b':
                asians.displayBehavior();
                europeans.displayBehavior();
                africans.displayBehavior();
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}
