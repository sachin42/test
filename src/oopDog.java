public class oopDog {
    String n;
    int a;
    double h;
    public void output(){
        System.out.println("Name of the dog is :"+n);
        System.out.println("The age of "+n+" is "+a);
        System.out.println("The height of "+n+" is "+h);
    }
    public oopDog(String name, int age, double height) { /// constructor
        this.n = name;
        this.a = age;
        this.h = height;
//        System.out.println("Name of the dog is :"+name);
//        System.out.println("The age of "+name+" is "+age);
//        System.out.println("The height of "+name+" is "+height);
    }
    public static void main(String[] args) {
        oopDog sheru = new oopDog("Sheru",2,2.5);
        oopDog tom = new oopDog("Tom",5,1.5);
        sheru.output();
        tom.output();
    }
}
