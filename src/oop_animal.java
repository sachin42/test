public class oop_animal {
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
    public oop_animal(String name,int age,String colour,double height){
        this.AnimalName = name;
        this.AnimalColor = colour;
        this.Animalage = age;
        this.AnimalHeight = height;
    }

}
class run{
    public static void main(String[] args) {

        oop_animal dog1 = new oop_animal("Tom",3,"Black",1.2);
        oop_animal dog2 = new oop_animal("Sheru",4,"White",2.1);
        oop_animal cat1 = new oop_animal("cher",4,"Brown",0.3);
        oop_animal cat2 = new oop_animal("billi",6,"orange",0.5);

        cat1.output_cat();
        dog1.output_dog();
        cat2.output_cat();
        dog2.output_dog();
    }
}
