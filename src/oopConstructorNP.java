class np_con{
    int age ;
    String name;
    np_con(){
        System.out.println("name :"+name);
        System.out.println("Age :"+age);
    }
}
public class oopConstructorNP {
    public static void main(String[] args) {
        np_con emp = new np_con();
        emp.name="sachin";
        emp.age= 29;
        System.out.println(emp.name);
        System.out.println(emp.age);
    }
}
