package akhilshettyym.JAVA.Assignments.Feb_27;
// 1. Write a Java program to create a method that takes an integer as a parameter and throws an
// exception if the number is odd.

class OddNumberException extends Exception{
    public OddNumberException(String message){
        super(message);
    }
}
public class NumberOdd {
    static void checkEven(int number) throws OddNumberException{
        System.out.println("-----------------------------------");
        if (number % 2!= 0){
            throw new OddNumberException("Error !!!" + number + " is an odd number");
        }
        else{
            System.out.println(number + " is an even number");
        }
    }
    public static void main(String[] args) {
        int[] numbers = {13, 20, 31, 4, 55, 60, 77, 84, 99, 101};
        for (int num : numbers){

        try{
            checkEven(num);
        }
        
        catch (OddNumberException e){
            System.out.println(e.getMessage());
        }

        finally{
            // System.out.println("This is the end of the program");
        }
    }
}
}