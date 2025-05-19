public class Main {

    public static void main(String[] args) {
  
      // ===== Method Scope Example =====
      // Code here CANNOT use variable x (it's not declared yet)
      
      int x = 100;  // Variable x is declared and initialized here
  
      // Code here CAN use x
      System.out.println("Method Scope - x: " + x);  // Outputs: 100
  
  
      // ===== Block Scope Example =====
      { // This is a new block
  
        // Code here CANNOT use y (it's not declared yet)
  
        int y = 200; // y is declared inside this block
  
        // Code here CAN use y
        System.out.println("Block Scope - y: " + y);  // Outputs: 200
  
      } // Block ends here
  
      // Code here CANNOT use y (y is out of scope)
      // System.out.println(y); // ❌ This would cause a compilation error
  
    }
  }  