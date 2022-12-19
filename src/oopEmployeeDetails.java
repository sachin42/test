public class oopEmployeeDetails {
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();
        e1.insert(44,"ajeet","Senior Engineer",5.8,540000);
        e2.insert(32,"irfan","Junior Engineer",6.9,322000);
        e3.insert(23,"nakul","Graphic Designer",6.1,220000);
        e1.display();
        e2.display();
        e3.display();
        e1.insert(33,"sachin","Order",6.1,34000);
        e1.display();
    }
}
class Employee{

    String name;
    int age;
    String designation;
    double height;
    double salary;
     void insert(int a, String n, String d, double h,double s) {
        age =a;
        name=n;
        height = h;
        designation=d;
        salary=s;
    }
//    Employee(int a, String n, String d, double h,double s) {
//        age =a;
//        name=n;
//        height = h;
//        designation=d;
//        salary=s;
//    }
    void display(){
        System.out.println(name+" "+age +" "+height+" "+designation+" "+salary);
    }
}