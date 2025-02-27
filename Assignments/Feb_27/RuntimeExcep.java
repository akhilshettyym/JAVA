package Assignments.Feb_27;

/**
 * Java Program to Demonstrate Throwing Multiple Runtime Exceptions
 * This program intentionally throws different runtime exceptions 
 * like ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, 
 * ArrayStoreException, and ClassCastException.
 * 
 * 3. write a program to throw all the runtime exceptions like ArithmeticException, NullPointerException, ArrayIndexOutOfBoundException, ArrayStoreException and ClassCastException.
 */

public class RuntimeExcep {
    
    // 1. Throws ArithmeticException
    static void throwArithmeticException() {
        System.out.println("\nThrowing ArithmeticException...");
        throw new ArithmeticException("Cannot divide by zero!");
    }
    
    // 2. Throws NullPointerException
    static void throwNullPointerException() {
        System.out.println("\nThrowing NullPointerException...");
        String str = null;
        if (str == null) {
            throw new NullPointerException("Attempted to access a null object!");
        }
    }
    // 3. Throws ArrayIndexOutOfBoundsException (Fix: Actually use arr)
    static void throwArrayIndexOutOfBoundsException() {
        System.out.println("\nThrowing ArrayIndexOutOfBoundsException...");
        int[] arr = {1, 2, 3};
        int value = arr[5]; // Attempting to access an invalid index
        System.out.println("Value at index 5: " + value); // This line won't be reached
    }

    // 4. Throws ArrayStoreException
    static void throwArrayStoreException() {
        System.out.println("\nThrowing ArrayStoreException...");
        Object[] objArray = new Integer[5]; // Integer array stored as Object[]
        objArray[0] = "Hello"; // This causes ArrayStoreException
    }

    // 5. Throws ClassCastException
    static void throwClassCastException() {
        System.out.println("\nThrowing ClassCastException...");
        Object obj = "Hello";
        if (obj instanceof Integer) {
            Integer num = (Integer) obj; // Will not be executed.
            System.out.println("Converted value: " + num);
        } else {
            throw new ClassCastException("Cannot cast String to Integer!");
        }
    }

    public static void main(String[] args) {
        try {
            throwArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e);
        }

        try {
            throwNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Caught: " + e);
        }

        try {
            throwArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught: " + e);
        }

        try {
            throwArrayStoreException();
        } catch (ArrayStoreException e) {
            System.out.println("Caught: " + e);
        }

        try {
            throwClassCastException();
        } catch (ClassCastException e) {
            System.out.println("Caught: " + e);
        }
    }
}