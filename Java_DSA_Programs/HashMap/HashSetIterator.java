import java.util.*;

public class HashSetIterator {
    public static void main(String[] args) {

        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Bangalore");

        Iterator<String> it = cities.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
