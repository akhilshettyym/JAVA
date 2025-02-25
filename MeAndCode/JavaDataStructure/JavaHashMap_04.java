package MeAndCode.JavaDataStructure;
import java.util.HashMap;
public class JavaHashMap_04 {
    public static void main(String[] args) {
        // Creation of HashMap Object called capital Cities
        HashMap <String, String> capitalCities = new HashMap<String, String>();

        // Adding keys and values (Country and city)
        capitalCities.put("India", "London");
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
    }
}
