// Write a program to print the id number name age and salary
// of two different employees using method overloading concept;
public class Quiz_21 {
    public static void main(String[] args) {
        employee(331,"Sachin",24,2300.56d);
        System.out.println("\n\n-----------------------------\n");
        employee("Shazeb",221,25,24000.56d);
    }

    public static void employee(int id, String name, int age, double salary) {
        System.out.println("Name: "+name);
        System.out.println("ID :"+id);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }
    public static void employee( String name, int id, int age, double salary) {
        System.out.println("Name: "+name);
        System.out.println("ID :"+id);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }
}
