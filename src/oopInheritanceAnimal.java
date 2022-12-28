public class oopInheritanceAnimal {
    public static void main(String[] args) {
        dog1 d = new dog1("Shera");
        System.out.println("----------------------");
        cat1 c = new cat1("Tommy");
    }
}
class dog1 extends animal{
    dog1 (String name){
        System.out.println("Dog "+ name +" is:");
        eat();
        jump();
        sleep();
    }
}
class cat1 extends animal{
    cat1(String name){
        System.out.println("Cat "+name+" is:");
        eat();
        jump();
        sleep();
    }
}
class animal{
    static void eat(){
        System.out.println("Eating");
    }
    static void jump(){
        System.out.println("Jumping");
    }
    static void sleep(){
        System.out.println("Sleeping");
    }
}