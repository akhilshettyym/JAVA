// Java Constructors Demonstration

public class Main {

  // === Attribute Declaration ===
  int x;
  int modelYear;
  String modelName;

  // === Default Constructor ===
  // A constructor with no parameters
  public Main() {
    x = 5; // Initializes x to 5
  }

  // === Parameterized Constructor (Single Parameter) ===
  public Main(int y) {
    x = y; // Initializes x using a passed value
  }

  // === Parameterized Constructor (Multiple Parameters) ===
  public Main(int year, String name) {
    modelYear = year;       // Set modelYear to passed year
    modelName = name;       // Set modelName to passed name
  }

  public static void main(String[] args) {

    System.out.println("=== Default Constructor Example ===");

    // Calls the default constructor
    Main obj1 = new Main();
    System.out.println("Value of x (default constructor): " + obj1.x); // Output: 5

    System.out.println("\n=== Constructor with Parameter ===");

    // Calls the constructor with one parameter
    Main obj2 = new Main(10);
    System.out.println("Value of x (parameterized): " + obj2.x); // Output: 10

    System.out.println("\n=== Constructor with Multiple Parameters ===");

    // Calls the constructor with multiple parameters
    Main myCar = new Main(1969, "Mustang");
    System.out.println("Car: " + myCar.modelYear + " " + myCar.modelName); // Output: 1969 Mustang
  }
}