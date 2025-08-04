package akhilshettyym.JAVA.MyCode.Z_Assignments.Feb_26;
// By using Comparator sort the list of students based on their obtained Marks in the increasing order.
// Create a Student class having student name, roll number and marks.
import java.util.*;

class Stud {
    public String name;
    public int roll;
    public int marks;

    public Stud(String name, int roll, int marks){
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }
}

class SortMarks implements Comparator<Stud>{
    public int compare(Stud a, Stud b){
        return Integer.compare(a.marks, b.marks);
    }
}

public class StudComparator {
    public static void main(String[] args) {
        ArrayList<Stud> myMarks = new ArrayList<Stud>();
        myMarks.add(new Stud("Akhil", 5, 95));
        myMarks.add(new Stud("Beru", 2, 70));
        myMarks.add(new Stud("Baran", 4, 60));
        myMarks.add(new Stud("Igris", 3, 89));
        myMarks.add(new Stud("Tusk", 1, 85));

        Collections.sort(myMarks, new SortMarks());

        for (Stud s : myMarks){
            System.out.println("Name: " + s.name + ", Roll: " + s.roll + ", Marks: " +s.marks);
        }
    }
}