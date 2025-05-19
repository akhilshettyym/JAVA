public class Main {

    // This is a user-defined method named 'myMethod'
    // 'static' means this method belongs to the class, not instances (objects)
    // 'void' means this method does not return a value
    static void Method() {
      // This line will be executed when the method is called
      System.out.println("I just got executed!");
    }
  
    // This is the main method: the starting point of any Java program
    public static void main(String[] args) {
      
      // Calling the method for the first time
      myMethod(); // Output: I just got executed!
      
      // Calling the method again (second time)
      myMethod(); // Output: I just got executed!
      
      // Calling the method one more time (third time)
      myMethod(); // Output: I just got executed!
    }
  }  