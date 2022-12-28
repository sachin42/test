public class Quiz_23 {
    public static void main(String[] args) {
        siblingDetails Sachin=new siblingDetails("Sachin",23,"Graduate");
        siblingDetails Sunil=new siblingDetails("Sunil",21,"ITI");
        siblingDetails RajKumar=new siblingDetails("RajKumar",15,"High School");
    }
}
class siblingDetails{
    siblingDetails(String name,int age, String standard){
        System.out.println("\n\nname : "+name+"\nage :"+age+"\nStandard :"+standard);
    }
}