package Assignments.Feb_25;
import java.util.*;

public class AltHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> dataMap = new HashMap<String, Integer>();
        dataMap.put("A", 1);
        dataMap.put("B", 2);
        dataMap.put("C", 5);
        dataMap.put("D", 3);
        dataMap.put("E", 6);

        Collection<Integer> value = dataMap.values();

        ArrayList<Integer> valueList = new ArrayList<Integer>(value);

        System.out.println("-------------------");
        System.out.println("Alternate values : ");
        for (int i = 0; i < valueList.size(); i += 2){
            System.out.print(valueList.get(i) + " ");
            
        }
        System.out.println("\t");
        System.out.println("-------------------");
    }
}