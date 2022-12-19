public class oopAnimal {
    String AnimalName;
    int Animalage;
    String AnimalColor;
    double AnimalHeight;

    public void output_dog() {
        System.out.println("Name of the dog is :"+AnimalName);
        System.out.println("The colour of "+AnimalName+" is "+AnimalColor);
        System.out.println("The age of "+AnimalName+" is "+Animalage);
        System.out.println("The height of "+AnimalName+" is "+AnimalHeight);
    }
    public void output_cat() {
        System.out.println("Name of the cat is :"+AnimalName);
        System.out.println("The colour of "+AnimalName+" is "+AnimalColor);
        System.out.println("The age of "+AnimalName+" is "+Animalage);
        System.out.println("The height of "+AnimalName+" is "+AnimalHeight);
    }
    public oopAnimal(String name, int age, String colour, double height){
        this.AnimalName = name;
        this.AnimalColor = colour;
        this.Animalage = age;
        this.AnimalHeight = height;
    }

}
class runAnimal{
    public static void main(String[] args) {

        oopAnimal dog1 = new oopAnimal("Tom",3,"Black",1.2);
        oopAnimal dog2 = new oopAnimal("Sheru",4,"White",2.1);
        oopAnimal cat1 = new oopAnimal("cher",4,"Brown",0.3);
        oopAnimal cat2 = new oopAnimal("billi",6,"orange",0.5);

        cat1.output_cat();
        dog1.output_dog();
        cat2.output_cat();
        dog2.output_dog();
    }
}
