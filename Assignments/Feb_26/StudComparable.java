// package Assignments.Feb_26;
// By using Comparable sort the list of students based on their obtained Marks in the decreasing order.
import java.util.*;

class Stud implements Comparable<Stud>{
    public String name;
    public int roll;
    public int marks;


    public Stud (String n, int r, int m){
        name = n;
        roll = r;
        marks = m;
    }

    public int compareTo(Stud other){
        // return this.marks - other.marks;     This sorts in Ascending order
        return other.marks - this.marks;     // This sorts in Descening order
    }
}

public class StudComparable {
    public static void main(String[] args) {
        ArrayList<Stud> myMarks = new ArrayList<Stud>();
        myMarks.add(new Stud("Akhil", 5, 95));
        myMarks.add(new Stud("Beru", 2, 70));
        myMarks.add(new Stud("Baran", 4, 60));
        myMarks.add(new Stud("Igris", 3, 89));
        myMarks.add(new Stud("Tusk", 1, 85));

        Collections.sort(myMarks);

        for(Stud s : myMarks){
            System.out.println("Name:" + s.name + ", Roll Number :" + s.roll + ", Marks:" + s.marks);
        }
    }
}