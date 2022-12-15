public class oop_dog {

    String n;
    int a;
    double h;

    public void output(){
        System.out.println("Name of the dog is :"+n);
        System.out.println("The age of "+n+" is "+a);
        System.out.println("The height of "+n+" is "+h);
    }

    public oop_dog(String name, int age,double height) { /// constructor
        this.n = name;
        this.a = age;
        this.h = height;
//        System.out.println("Name of the dog is :"+name);
//        System.out.println("The age of "+name+" is "+age);
//        System.out.println("The height of "+name+" is "+height);
    }

    public static void main(String[] args) {
        oop_dog sheru = new oop_dog("Sheru",2,2.5);
        oop_dog tom = new oop_dog("Tom",5,1.5);
        sheru.output();
        tom.output();
    }
}
