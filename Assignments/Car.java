package Assignments;

class Car {
    static int wheels = 4;  // Static variable (shared among all the cars)
    final String brand;     // Final variable (set via constructor, cannot be changed)

    // Constructor to initialize brand
    public Car(String brand) {
        this.brand = brand;
    }

    // Static method (modify wheels)
    public static void changeWheels(int newWheels) {
        wheels = newWheels;
    }

    // Method to display car details
    public void displayCarInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Number of Wheels: " + wheels);
    }

    public static void main(String[] args) {
        // Two Car objects with different brands
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda");

        System.out.println("Before modifying wheels:");
        car1.displayCarInfo();
        car2.displayCarInfo();

        // Modifying the static variable wheels
        Car.changeWheels(6);

        System.out.println("\nAfter modifying wheels:");
        car1.displayCarInfo();
        car2.displayCarInfo();


        // car1.brand = "Ford";  //  This is NOT allowed.

        System.out.println("\nFinal variable 'brand' cannot be changed once set.");
    }
}
