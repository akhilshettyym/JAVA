package MeAndCode.JavaDataStructure;
import java.util.TreeSet;
public class JavaTreeSet_08 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Date");
        treeSet.add("Elderberry");
        System.out.println("TreeSet: " + treeSet);
    }
}
// Duplications are not allowed. no extra logic for sorting.