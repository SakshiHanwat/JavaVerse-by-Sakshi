import java.util.*;

public class HashSetBasic {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2); // duplicate
        set.add(1); // duplicate

        System.out.println(set);   // no duplicates, unordered

        System.out.println(set.contains(2)); // true
        System.out.println(set.contains(5)); // false

        set.remove(2);
        System.out.println(set);

        System.out.println(set.size());
        System.out.println(set.isEmpty());

        set.clear();
        System.out.println(set.isEmpty());
    }
}
