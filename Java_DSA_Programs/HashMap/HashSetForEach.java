import java.util.*;

public class HashSetForEach {
    public static void main(String[] args) {

        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Pune");

        for (String city : cities) {
            System.out.println(city);
        }
    }
}
