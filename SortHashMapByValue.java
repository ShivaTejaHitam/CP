import java.util.*;
import java.util.stream.*;

public class HashMapSortByValue {
    public static void main(String[] args) {
        // Sample HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 50);
        map.put("Banana", 20);
        map.put("Orange", 30);
        map.put("Mango", 40);

        // Sort the map by value and collect it into a LinkedHashMap
        Map<String, Integer> sortedMap = map.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue()) // Sort by value
            .collect(Collectors.toMap(
                Map.Entry::getKey, 
                Map.Entry::getValue, 
                (e1, e2) -> e1, // Merge function in case of duplicates
                LinkedHashMap::new // Collect into LinkedHashMap to maintain order
            ));

        // Print the sorted map
        sortedMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
