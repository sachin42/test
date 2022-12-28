public class oopDog {
    public static void main(String[] args) {
        dog sheru = new dog("Sheru",2,2.5);
        dog tom = new dog("Tom",5,1.5);
        sheru.output();
        tom.output();
    }
}
class dog{
    String n;
    int a;
    double h;
    public void output(){
        System.out.println("Name of the dog is :"+n);
        System.out.println("The age of "+n+" is "+a);
        System.out.println("The height of "+n+" is "+h);
    }
    public dog(String name, int age, double height) { /// constructor
        this.n = name;
        this.a = age;
        this.h = height;
//        System.out.println("Name of the dog is :"+name);
//        System.out.println("The age of "+name+" is "+age);
//        System.out.println("The height of "+name+" is "+height);
    }
}