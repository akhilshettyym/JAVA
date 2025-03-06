// package PracticeSets;

public class Sum {
    public static void main(String[] args) {
        int Sum = 0;
        int n = 3;
        for(int i = 0; i < n; i++){
            Sum = Sum + (2*i);
        }
        System.out.println("Sum of first " + n + "even natural numbers is " + Sum);
    }
}