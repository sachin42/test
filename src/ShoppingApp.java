import java.util.Scanner;
public class ShoppingApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Grocery g1=new Grocery();
        Vegetables v1=new Vegetables();
        Fabric f1=new Fabric();
        Electronics e1=new Electronics();
        double total=0;
        int discount=0;
        int option;
        do {
            System.out.println("Choose a Shopping category -:");
            System.out.println("""
                    1.Groceries
                    2.Vegetables
                    3.Fabric
                    4.Electronics
                    5.Stop Shopping
                    """);
            option = in.nextInt();
            switch (option) {
                case 1 -> {
                    g1.options();
                    total += g1.grocery;
                    discount += 10;
                }
                case 2 -> {
                    v1.option();
                    total += v1.vegetables;
                    discount += 5;
                }
                case 3 -> {
                    f1.option();
                    total += f1.fabric;
                    discount += 20;
                }
                case 4 -> {
                    e1.option();
                    total += e1.electronic;
                    discount += 20;
                }
                case 5 -> System.out.println("Shopping Completed");
                default -> System.out.println("Invalid Entry");
            }
        }while (option!=5);

        System.out.println("Total shopping cart price is = "+total);
        System.out.println("Total discount on shopping cart is = "+discount+"%");
        double netPayableAmount = total - ((total * discount)/total);
        System.out.println("Net Payable amount = "+netPayableAmount);
    }
}

class Grocery extends SelectItem{
    double grocery;
    void options(){
        Scanner in=new Scanner(System.in);
        int option;
        do{
            System.out.println("\nchoose an item -:");
            System.out.println("""
                1.Milk      Rs. 30
                2.Sugar     Rs. 50
                3.Tea       Rs. 35.50
                4.Stop
                """);
            option = in.nextInt();
            grocery = choose(option,30,50,35.50);
        }while (option!=4);
        System.out.println("grocerY = "+grocery);
    }
}

class Vegetables extends SelectItem {
    double vegetables;
    void option(){
        Scanner in=new Scanner(System.in);
        int option;
        do{
            System.out.println("\nchoose an item -:");
            System.out.println("""
                1.Onion         Rs. 25
                2.Potato        Rs. 30
                3.CullY Flower  Rs. 15.50
                4.Stop
                """);
            option = in.nextInt();
            vegetables = choose(option,25,30,15.50);
        }while (option!=4);
        System.out.println("grocerY = "+vegetables);
    }
}

class Fabric extends SelectItem{
    double fabric;
    void option(){
        Scanner in=new Scanner(System.in);
        int option;
        do{
            System.out.println("\nchoose an item -:");
            System.out.println("""
                1.Jeans         Rs. 1250.99
                2.Shirt         Rs. 750.49
                3.Sweat Shirt   Rs. 499.50
                4.Stop
                """);
            option = in.nextInt();
            fabric = choose(option,1250.99,750.49,499.50);
        }while (option!=4);
        System.out.println("grocerY = "+fabric);
    }
}

class Electronics extends SelectItem{
    double electronic;
    void option(){
        Scanner in=new Scanner(System.in);
        int option;
        do{
            System.out.println("\nchoose an item -:");
            System.out.println("""
                1.Speaker       Rs. 4999.99
                2.Television    Rs. 25499.99
                3.Refrigerator  Rs. 45000.50
                4.Stop
                """);
            option = in.nextInt();
            electronic = choose(option,4999.99,25499.49,45000.50);
        }while (option!=4);
        System.out.println("grocerY = "+electronic);
    }
}

class SelectItem {
    double total=0;
    double choose(int option, double item1, double item2, double item3) {
        switch (option) {
            case 1 -> total += item1;
            case 2 -> total += item2;
            case 3 -> total += item3;
            case 4 -> System.out.println("Stopping");
            default -> System.out.println("Invalid option");
        }
        return total;
    }
}