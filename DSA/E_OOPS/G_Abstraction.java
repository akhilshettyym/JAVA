package akhilshettyym.JAVA.DSA.E_OOPS;
// Multiple inheritance is possible in interface and not in classes
abstract class Animal {
    abstract void walk();
}
class Horse extends Animal {
    public void walk() {
        System.out.println("Walks on four legs");
    }
}
class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on two legs");
    }
}
public class G_Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}