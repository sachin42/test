public class oopInheritance extends animal1{
    public static void main(String[] args) {
        System.out.print("Dog: ");
        eat();
        bark();
    }
}
class animal1{
    static void eat(){
        System.out.println("Eating");
    }
    static void bark(){
        System.out.println("Barking");
    }
}
