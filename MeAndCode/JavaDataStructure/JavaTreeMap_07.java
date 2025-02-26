package MeAndCode.JavaDataStructure;
import java.util.TreeMap;
public class JavaTreeMap_07 {
    public static void main(String[] args) {
        TreeMap<Integer, String> number = new TreeMap<Integer, String>();
        number.put(1, "One");
        number.put(3,"Three");
        number.put(4, "Four");
        number.put(5, "Five");
        number.put(2, "Two");
        System.out.println(number);
    }
}
// Automatically sort in order according to the keys and no duplication.