import java.util.*;

public class HashMapBasic {
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        // put
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        // get
        System.out.println(hm.get("India"));     // 100
        System.out.println(hm.get("Indonesia")); // null

        // containsKey
        System.out.println(hm.containsKey("India")); // true
        System.out.println(hm.containsKey("Delhi")); // false

        // remove
        hm.remove("China");
        System.out.println(hm);

        // size
        System.out.println(hm.size());

        // isEmpty
        System.out.println(hm.isEmpty());
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
