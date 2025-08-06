package akhilshettyym.JAVA.DSA.E_OOPS;

class Car {
    String brand;
    String color;

    public void drive() {
        System.out.println("Driving to nowhere ");
    }

    public void printBrand(){
        System.out.println(this.brand);
    }
    public void printColor(){
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class A_OOPS {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Maserati";
        car1.color = "black";

        Car car2 = new Car();
        car2.brand = "Porsche";
        car2.color = "red";

        car1.drive();
        car1.printBrand();
        car2.printColor();
        
        Student student1 = new Student();
        student1.name = "Akhil";
        student1.age = 22;

        Student student2 = new Student();
        student2.name = "Shetty";
        student2.age = 23;

        student1.printInfo();
        student2.printInfo();
    }
}