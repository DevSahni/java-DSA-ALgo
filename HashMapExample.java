import java.util.*; // Importing java.util package

public class HashMapExample { // Changed class name to avoid conflict
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Insert values into the map using map.put
        map.put("India", 20);
        map.put("Italy", 30);
        map.put("Paris", 40);

        // Print the HashMap
        System.out.println(map);
    }
}
