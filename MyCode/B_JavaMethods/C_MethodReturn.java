public class Main {

    // Method with one parameter, returns an int
    static int addFive(int x) {
      return 5 + x;
    }
  
    // Method with two parameters, returns an int
    static int addNumbers(int x, int y) {
      return x + y;
    }
  
    public static void main(String[] args) {
  
      // Calling method with one parameter and printing the result directly
      System.out.println("=== Return Value from Single Parameter Method ===");
      System.out.println("5 + 3 = " + addFive(3));  // Outputs 8
  
      // Calling method with two parameters and printing the result directly
      System.out.println("\n=== Return Value from Two Parameters Method ===");
      System.out.println("5 + 3 = " + addNumbers(5, 3));  // Outputs 8
  
      // Storing the return value in a variable (recommended)
      System.out.println("\n=== Storing Returned Value in a Variable ===");
      int result = addNumbers(10, 20);
      System.out.println("10 + 20 = " + result);  // Outputs 30
    }
  }  