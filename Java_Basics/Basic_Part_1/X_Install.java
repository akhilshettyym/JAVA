package akhilshettyym.JAVA.Java_Basics.Basic_Part_1;

public class X_Install {
    public static void main(String[] args) {
        System.out.println("\n Java Version :" + System.getProperty("java.version"));
        System.out.println("\n Java Runtime Version :" + System.getProperty("java.runtime.version"));
        System.out.println("\n Java Home :" + System.getProperty("java.home"));
        System.out.println("\n Java Vendor :" + System.getProperty("java.vendor"));
        System.out.println("\n Java Vendor URL :" + System.getProperty("java.vendor.url"));
        System.out.println("\n Java Class Path :" + System.getProperty("java.class.path") + "\n");
    }
}