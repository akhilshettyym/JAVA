public class Main {

    public static void main(String[] args) {
      
      // Call the recursive method to sum numbers from 1 to 10
      int result1 = sumToTen(10);
      System.out.println("Sum from 1 to 10 is: " + result1); // Outputs: 55
  
      // Call the recursive method to sum numbers from 5 to 10
      int result2 = sumInRange(5, 10);
      System.out.println("Sum from 5 to 10 is: " + result2); // Outputs: 45
    }
  
    // Recursively sums numbers from 1 to k
    public static int sumToTen(int k) {
      if (k > 0) {
        return k + sumToTen(k - 1); // Recursive call: keeps reducing k
      } else {
        return 0; // Base case (halting condition): when k is 0
      }
    }
  
    // Recursively sums numbers from start to end
    public static int sumInRange(int start, int end) {
      if (end > start) {
        return end + sumInRange(start, end - 1); // Recursive call with reduced end
      } else {
        return end; // Base case: when start == end
      }
    }
  }  