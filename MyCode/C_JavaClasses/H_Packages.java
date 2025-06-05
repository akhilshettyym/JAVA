// Simulating everything in one file for demo purposes

// ===============================
// Built-in Package Example
// ===============================
import java.util.Scanner;

// ===============================
// Main class demonstrating both
// ===============================
public class Main {

  // Simulating a user-defined package class as a static nested class
  // (In real projects, this would go in: mypack/MyPackageClass.java)
  public static class MyPackageClass {
    public static void displayMessage() {
      System.out.println("This is a user-defined package class!");
    }
  }

  public static void main(String[] args) {
    // ----- Using Built-in Package (Scanner) -----
    Scanner myScanner = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = myScanner.nextLine();
    System.out.println("Hello, " + name + "!");

    // ----- Simulating User-defined Package Usage -----
    MyPackageClass.displayMessage();
  }
}