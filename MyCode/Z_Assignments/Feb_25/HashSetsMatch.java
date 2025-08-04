package akhilshettyym.JAVA.MyCode.Z_Assignments.Feb_25;
// 1. Write a program to compare two hash sets and print only matching values from two sets.
import java.util.*;
public class HashSetsMatch {
    public static void main(String[] args) {
        HashSet<String> foodMe = new HashSet<String>();
        foodMe.add("Gulab jamun");
        foodMe.add("Jalebi");
        foodMe.add("Kaju katli");
        foodMe.add("Kheer");
        foodMe.add("Ras malai");

        HashSet<String> foodYou = new HashSet<String>();
        foodYou.add("Ras malai");
        foodYou.add("Jalebi");
        foodYou.add("Kaju katli");
        foodYou.add("Kheer");
        foodYou.add("Phirni");

        HashSet<String> foodMeNYou = new HashSet<String>();

        for (String sweet : foodMe){
            if (foodYou.contains(sweet)){
                foodMeNYou.add(sweet);
            }
        }
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("The delightful sweet of both lists are : " + foodMeNYou);
        System.out.println("------------------------------------------------------------------------------");
    }
}