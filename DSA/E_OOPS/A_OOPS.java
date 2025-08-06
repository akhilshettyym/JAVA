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
    }
}