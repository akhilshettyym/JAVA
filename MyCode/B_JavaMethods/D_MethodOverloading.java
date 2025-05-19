public class Main {

    // Method to add two integers
    static int plusMethod(int x, int y) {
      return x + y;
    }
  
    // Overloaded method to add two doubles
    static double plusMethod(double x, double y) {
      return x + y;
    }
  
    public static void main(String[] args) {
  
      // Call method with int arguments
      int myNum1 = plusMethod(8, 5); // Calls int version
  
      // Call method with double arguments
      double myNum2 = plusMethod(4.3, 6.26); // Calls double version
  
      // Output the results
      System.out.println("int: " + myNum1);     // Outputs: int: 13
      System.out.println("double: " + myNum2);  // Outputs: double: 10.56
    }
  }  