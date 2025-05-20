public class Main {

  // Method with one parameter: prints a full name
  static void printName(String fname) {
      System.out.println(fname + " Refsnes");
  }

  // Method with two parameters: prints name and age
  static void printNameAndAge(String fname, int age) {
      System.out.println(fname + " is " + age + " years old.");
  }

  // Method with if...else: checks age and prints access message
  static void checkAge(int age) {
      if (age < 18) {
          System.out.println("Access denied - You are not old enough!");
      } else {
          System.out.println("Access granted - You are old enough!");
      }
  }

  public static void main(String[] args) {

      // Calling method with one parameter
      System.out.println("=== Method with One Parameter (printName) ===");
      printName("Liam");
      printName("Jenny");
      printName("Anja");

      // Calling method with two parameters
      System.out.println("\n=== Method with Two Parameters (printNameAndAge) ===");
      printNameAndAge("Liam", 5);
      printNameAndAge("Jenny", 8);
      printNameAndAge("Anja", 31);

      // Calling method with if...else logic
      System.out.println("\n=== Method with If...Else Logic (checkAge) ===");
      checkAge(16);
      checkAge(20);
  }
}