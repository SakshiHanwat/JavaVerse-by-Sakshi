import java.util.*;

public class HashMapIteration {
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 60);
        hm.put("Nepal", 5);

        for (String key : hm.keySet()) {
            System.out.println("Key = " + key + ", Value = " + hm.get(key));
        }
    }
}
